package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.repository.ContainerRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;

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
    public void read() {
    }
    // U - update
    public void update() {
    }
    // D - delete
    public void delete() {
    }
    // L - list
    public void list() {
    }
}
