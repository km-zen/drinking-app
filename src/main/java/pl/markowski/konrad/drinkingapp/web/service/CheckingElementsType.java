package pl.markowski.konrad.drinkingapp.web.service;

import pl.markowski.konrad.drinkingapp.web.model.BottleModel;
import pl.markowski.konrad.drinkingapp.web.model.BowlModel;
import pl.markowski.konrad.drinkingapp.web.model.CatModel;
import pl.markowski.konrad.drinkingapp.web.model.ManModel;

public interface CheckingElementsType {

    default double getVolumeFromDrinkerType(String type){
        if(type.equals("cat")){
            return CatModel.VOLUME;
        }
        else if(type.equals("man")){
            return ManModel.VOLUME;
        }
        else return 0.0;
    }

    default double getVolumeFromContainerType(String type){
        if(type.equals("bottle")){
            return BottleModel.VOLUME;
        } else if (type.equals("bowl")) {
            return BowlModel.VOLUME;
        }
        else return 0.0;
    }
}
