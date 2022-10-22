package pl.markowski.konrad.drinkingapp.web.repository.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DRINKER_TYPE")
public class DrinkerTypeEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal volume;

    public DrinkerTypeEnity() {
    }

    public DrinkerTypeEnity(String name, BigDecimal volume) {
        this.name = name;
        this.volume = volume;
    }

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
        return "DrinkerType{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
