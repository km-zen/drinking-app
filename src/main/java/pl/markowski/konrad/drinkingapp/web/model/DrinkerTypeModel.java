package pl.markowski.konrad.drinkingapp.web.model;

import pl.markowski.konrad.drinkingapp.web.repository.entity.DrinkerEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class DrinkerTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal volume;

//    @OneToMany
//    @JoinColumn
//    private DrinkerEntity drinker;

    public DrinkerTypeModel() {
    }

    public DrinkerTypeModel(String name, BigDecimal volume) {
        this.name = name;
        this.volume = volume;
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
        return "DrinkerType{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
