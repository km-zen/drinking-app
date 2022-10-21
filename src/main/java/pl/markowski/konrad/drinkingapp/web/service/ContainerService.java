package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.repository.ContainerRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ContainerService implements CheckingElementsType {
private static final Logger LOGGER = Logger.getLogger(ContainerService.class.getName());

private final ContainerRepository containerRepository;

    public ContainerService(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    // C - create
    public void create(String name, String containerType) {
        LOGGER.info("create(" + name + " of type: " + containerType +")");
        ContainerEntity containerEntity = new ContainerEntity();
        containerEntity.setName(name);
        containerEntity.setType(containerType);
        containerEntity.setVolume(getVolumeFromContainerType(containerType));
        containerRepository.save(containerEntity);
    }
    // R - read
    public ContainerEntity read(Long id) throws Exception {
        LOGGER.info("read(" + id + ")");
        Optional<ContainerEntity> optionalContainerEntity = containerRepository.findById(id);
        ContainerEntity containerEntity = optionalContainerEntity.orElseThrow(
                () -> new Exception("Can't find container with id: " + id)
        );
        LOGGER.info("read(...) =  " + containerEntity);
        return containerEntity;
    }
    // U - update
    public void update() {
    }
    // D - delete
    public void delete() {
    }
    // L - list
    public List<ContainerEntity> list() {
        return containerRepository.findAll();
    }
}
