package pl.markowski.konrad.drinkingapp.web.repository.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CONTAINERS")
public class ContainerEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private BigDecimal volume;

    @OneToOne
    @JoinColumn(name = "CONTAINER_TYPE_ID")
    private ContainerTypeEntity type;

    public ContainerEntity() {
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

    public ContainerTypeEntity getType() {
        return type;
    }

    public void setType(ContainerTypeEntity type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContainerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
