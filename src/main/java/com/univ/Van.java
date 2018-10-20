package com.univ;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Van extends Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int maxWeight;

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
