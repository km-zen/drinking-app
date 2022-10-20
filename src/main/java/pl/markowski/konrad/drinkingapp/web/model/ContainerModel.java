package pl.markowski.konrad.drinkingapp.web.model;

//public record ContainerModel(String name, int volume) {
public class ContainerModel {
    private Long id;
    private String name;
    private double volume;


    @Override
    public String toString() {
        return "ContainerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
