package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
    @Id
    @Column(name = "plate_no")
    private int plateNo;
    @Column(name = "model")
    private int model;
    @Column(name = "color")
    private String color;

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(int plateNo) {
        this.plateNo = plateNo;
    }
}
