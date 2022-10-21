package pl.markowski.konrad.drinkingapp.web.repository.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DRINKERS")
public class DrinkerEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private BigDecimal volume;
    //    private String type;

    @OneToOne
    @JoinColumn(name = "DRINKER_TYPE_ID")
    private DrinkerTypeEnity type;

    public DrinkerEntity() {
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

    public DrinkerTypeEnity getType() {
        return type;
    }

    public void setType(DrinkerTypeEnity type) {
        this.type = type;
    }
    //    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    @Override
    public String toString() {
        return "DrinkerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
