package pl.markowski.konrad.drinkingapp.web.service;

import pl.markowski.konrad.drinkingapp.web.repository.entity.ContainerEntity;
import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;

public interface CompareVolume {
    default Boolean compareVolume(DrinkerEntity drinkerEntity, ContainerEntity containerEntity) {
        if (drinkerEntity.getVolume().compareTo(containerEntity.getVolume()) == 1) {
            return true;
        }
        return false;
    }
}
