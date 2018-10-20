package com.univ;

import javax.persistence.*;

import java.util.List;


@Entity
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int plateNumber;
    @OneToMany
    private List<Rent> rents;

    public List<Rent> getRents() {
        return this.rents;
    }

    public int getId() {
        return id;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
