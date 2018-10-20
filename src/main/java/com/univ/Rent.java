package com.univ;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date endRent;
    @Temporal(TemporalType.DATE)
    private Date beginRent;
    @OneToOne
    private Person person;
    @OneToOne
    private Vehicule vehicule;

    public Vehicule getVehicule(){
        return this.vehicule;
    }
    public void setVehicule(Vehicule vehicule){
        this.vehicule = vehicule;
    }

    public Person getPerson() {
        return this.person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

