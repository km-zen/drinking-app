package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.model.CatModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.model.ManModel;
import pl.markowski.konrad.drinkingapp.web.repository.DrinkerRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DrinkerService implements TypeValidation{
    private static final Logger LOGGER = Logger.getLogger(DrinkerService.class.getName());

    private DrinkerRepository drinkerRepository;

    public DrinkerService(DrinkerRepository drinkerRepository) {
        this.drinkerRepository = drinkerRepository;
    }

    // C - create
    public void create(String name, String drinkerType) {
    LOGGER.info("create(" + name + " of type: " + drinkerType +")");
    DrinkerEntity drinkerEntity = new DrinkerEntity();
    drinkerEntity.setName(name);
    drinkerEntity.setType(drinkerType);
//    if (drinkerType.equals("cat")){
//       CatModel catModel = new CatModel(name);
//        drinkerEntity.setVolume(catModel.getVolume());
//    }
//    else if(drinkerType.equals("man")) {
//        DrinkerModel drinkerModel = new ManModel(name);
//        drinkerEntity.setVolume(drinkerModel.getVolume());
//    }
        drinkerEntity.setVolume(getVolumeFromType(drinkerType));
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
                ()-> new Exception("Can't find drinker with id: " + drinkerModel.getId()));
                drinkerEntity.setName(drinkerModel.getName());
                drinkerRepository.save(drinkerEntity);

    }
    // D - delete
    public void delete(Long id) throws Exception {
        Optional<DrinkerEntity> optionalDrinkerEntity = drinkerRepository.findById(id);
        DrinkerEntity drinkerEntity = optionalDrinkerEntity.orElseThrow(
                ()-> new Exception("Can't find drinker with id: " + id )
        );
        drinkerRepository.delete(drinkerEntity);
    }
    // L - list
    public List<DrinkerEntity> list() {
       return drinkerRepository.findAll();
    }
}
