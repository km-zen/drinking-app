package pl.markowski.konrad.drinkingapp.web.model;

public class BottleModel extends ContainerModel{
    private static final double VOLUME = 1.5;
    public BottleModel(String name) {
        super(name, VOLUME);
    }

}
