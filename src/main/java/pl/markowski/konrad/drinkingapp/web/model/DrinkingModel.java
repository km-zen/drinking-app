package pl.markowski.konrad.drinkingapp.web.model;

import java.math.BigDecimal;

public class DrinkingModel {
    private Long id;
    private String drinkerName;
    private String drinkerType;
    private BigDecimal drinkerVolume;
    private String containerName;
    private String containerType;
    private BigDecimal containerVolume;
    private Boolean result;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrinkerName() {
        return drinkerName;
    }

    public void setDrinkerName(String drinkerName) {
        this.drinkerName = drinkerName;
    }

    public String getDrinkerType() {
        return drinkerType;
    }

    public void setDrinkerType(String drinkerType) {
        this.drinkerType = drinkerType;
    }

    public BigDecimal getDrinkerVolume() {
        return drinkerVolume;
    }

    public void setDrinkerVolume(BigDecimal drinkerVolume) {
        this.drinkerVolume = drinkerVolume;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public BigDecimal getContainerVolume() {
        return containerVolume;
    }

    public void setContainerVolume(BigDecimal containerVolume) {
        this.containerVolume = containerVolume;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "DrinkModel{" +
                "id=" + id +
                ", drinkerName='" + drinkerName + '\'' +
                ", drinkerType='" + drinkerType + '\'' +
                ", drinkerVolume=" + drinkerVolume +
                ", containerName='" + containerName + '\'' +
                ", containerType='" + containerType + '\'' +
                ", containerVolume=" + containerVolume +
                ", result=" + result +
                '}';
    }
}
