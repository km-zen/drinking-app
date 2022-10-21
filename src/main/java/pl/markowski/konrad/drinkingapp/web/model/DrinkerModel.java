package pl.markowski.konrad.drinkingapp.web.model;

import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerTypeEnity;

public class DrinkerModel {
    private Long id;
    private String name;
    protected DrinkerTypeEnity type;
    protected double volume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
