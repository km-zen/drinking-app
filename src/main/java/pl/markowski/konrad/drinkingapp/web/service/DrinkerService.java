package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.repository.DrinkerRepository;
import pl.markowski.konrad.drinkingapp.web.repository.DrinkerTypeRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerTypeEnity;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DrinkerService {
    private static final Logger LOGGER = Logger.getLogger(DrinkerService.class.getName());

    private final DrinkerRepository drinkerRepository;
    private final DrinkerTypeRepository drinkerTypeRepository;

    public DrinkerService(DrinkerRepository drinkerRepository, DrinkerTypeRepository drinkerTypeRepository) {
        this.drinkerRepository = drinkerRepository;
        this.drinkerTypeRepository = drinkerTypeRepository;
    }

    // C - create
    public void create(String name, String drinkerTypeId) throws Exception {
        LOGGER.info("create(" + name + " and type id: " + drinkerTypeId + ")");
        DrinkerEntity drinkerEntity = new DrinkerEntity();
        Optional<DrinkerTypeEnity> optionalDrinkerTypeEnity = drinkerTypeRepository.findById(Long.valueOf(drinkerTypeId));
        DrinkerTypeEnity drinkerTypeEnity = optionalDrinkerTypeEnity.orElseThrow(
                () -> new Exception("Can't find drinker type with id: " + drinkerTypeId)
        );

        drinkerEntity.setVolume(drinkerTypeEnity.getVolume());
        drinkerEntity.setName(name);
        drinkerEntity.setType(drinkerTypeEnity);
        drinkerRepository.save(drinkerEntity);
    }

    // R - read
    public DrinkerEntity read(Long id) throws Exception {
        LOGGER.info("read(" + id + ")");
        Optional<DrinkerEntity> optionalDrinkerEntity = drinkerRepository.findById(id);
        DrinkerEntity drinkerEntity = optionalDrinkerEntity.orElseThrow(
                () -> new Exception("Can't find drinker with id: " + id));
        LOGGER.info("read(...) =  " + drinkerEntity);
        return drinkerEntity;

    }

    // U - update
    public void update(DrinkerModel drinkerModel) throws Exception {
        Optional<DrinkerEntity> optionalDrinkerEntity = drinkerRepository.findById(drinkerModel.getId());
        DrinkerEntity drinkerEntity = optionalDrinkerEntity.orElseThrow(
                () -> new Exception("Can't find drinker with id: " + drinkerModel.getId()));
        drinkerEntity.setName(drinkerModel.getName());
        drinkerRepository.save(drinkerEntity);

    }

    // D - delete
    public void delete(Long id) throws Exception {
        Optional<DrinkerEntity> optionalDrinkerEntity = drinkerRepository.findById(id);
        DrinkerEntity drinkerEntity = optionalDrinkerEntity.orElseThrow(
                () -> new Exception("Can't find drinker with id: " + id)
        );
        drinkerRepository.delete(drinkerEntity);
    }

    // L - list
    public List<DrinkerEntity> list() {
        return drinkerRepository.findAll();
    }
}
