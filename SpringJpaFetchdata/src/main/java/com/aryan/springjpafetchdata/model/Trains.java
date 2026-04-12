package com.aryan.springjpafetchdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Trains {

    @Id
    private int trainID;

    private String trainname;

    private String traindestination;

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getTraindestination() {
        return traindestination;
    }

    public void setTraindestination(String traindestination) {
        this.traindestination = traindestination;
    }

    @Override
    public String toString() {
        return "Trains{" +
                "trainID=" + trainID +
                ", trainname='" + trainname + '\'' +
                ", traindestination='" + traindestination + '\'' +
                '}';
    }
}
