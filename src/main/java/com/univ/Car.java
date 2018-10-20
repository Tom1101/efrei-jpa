package com.univ;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car extends Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numberOfSeats;

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
