package pl.markowski.konrad.drinkingapp.web.model;

public class DrinkerModel {
    private String name;
    private double volume;

    public DrinkerModel(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "DrinkerModel{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
