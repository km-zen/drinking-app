package pl.markowski.konrad.drinkingapp.web.model;

public class DrinkerModel {
    public String name;
    public int volume;

    public DrinkerModel(String name, int volume) {
        this.name = name;
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
