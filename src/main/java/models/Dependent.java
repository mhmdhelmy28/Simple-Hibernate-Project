package models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Dependent {
    private String relation;
    private String name;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
