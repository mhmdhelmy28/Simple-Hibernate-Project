package models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String zone;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }
}
