package pl.markowski.konrad.drinkingapp.web.service;

import org.springframework.stereotype.Service;
import pl.markowski.konrad.drinkingapp.web.repository.DrinkingRepository;
import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkingEntity;

import java.util.List;

@Service
public class DrinkingService implements CompareVolume {
    private final DrinkingRepository drinkingRepository;

    public DrinkingService(DrinkingRepository drinkingRepository) {
        this.drinkingRepository = drinkingRepository;
    }

    // C - Create
    public void create(DrinkerEntity drinkerEntity, ContainerEntity containerEntity) {
        DrinkingEntity drinkingEntity = new DrinkingEntity();
        drinkingEntity.setDrinkerName(drinkerEntity.getName());
        drinkingEntity.setDrinkerType(drinkerEntity.getType().getName());
        drinkingEntity.setDrinkerVolume(drinkerEntity.getVolume());

        drinkingEntity.setContainerName(containerEntity.getName());
        drinkingEntity.setContainerType(containerEntity.getType().getName());
        drinkingEntity.setContainerVolume(containerEntity.getVolume());

        drinkingEntity.setResult(compareVolume(drinkerEntity, containerEntity));
        drinkingRepository.save(drinkingEntity);
    }

    // L - List
    public List<DrinkingEntity> list() {
        return drinkingRepository.findAll();
    }
}
