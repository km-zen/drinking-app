package pl.markowski.konrad.drinkingapp.web.service;

import pl.markowski.konrad.drinkingapp.web.model.CatModel;
import pl.markowski.konrad.drinkingapp.web.model.DrinkerModel;
import pl.markowski.konrad.drinkingapp.web.model.ManModel;

public interface TypeValidation {

    default double getVolumeFromType(String type){
        if(type.equals("cat")){
            return CatModel.VOLUME;
        }
        else if(type.equals("man")){
            return ManModel.VOLUME;
        }
        else return 0.0;
    }
}
