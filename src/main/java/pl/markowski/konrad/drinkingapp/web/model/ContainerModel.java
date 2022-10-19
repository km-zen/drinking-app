package pl.markowski.konrad.drinkingapp.web.model;

//public record ContainerModel(String name, int volume) {
public class ContainerModel {
    protected String name;
    protected double volume;

    public ContainerModel(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "ContainerModel{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
