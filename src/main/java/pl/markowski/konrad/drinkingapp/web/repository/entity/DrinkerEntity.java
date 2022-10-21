package pl.markowski.konrad.drinkingapp.web.repository.entity;

import pl.markowski.konrad.drinkingapp.web.model.DrinkerTypeModel;

import javax.persistence.*;

@Entity
@Table(name = "DRINKERS")
public class DrinkerEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private double volume;
    //    private String type;

    @OneToOne
    @JoinColumn(name = "DRINKER_TYPE_ID")
    private DrinkerTypeModel type;

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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
