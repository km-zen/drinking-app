package pl.markowski.konrad.drinkingapp.web.service;

import pl.markowski.konrad.drinkingapp.web.model.ContainerModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;

public interface Drinking {

    void drinking(DrinkerModel drinker, ContainerModel containerModel, int volume);
}
