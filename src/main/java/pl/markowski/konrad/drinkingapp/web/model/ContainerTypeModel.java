package pl.markowski.konrad.drinkingapp.web.model;

import java.math.BigDecimal;

public class ContainerTypeModel {
    private Long id;
    private String name;
    private BigDecimal volume;

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

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "ContainerTypeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
