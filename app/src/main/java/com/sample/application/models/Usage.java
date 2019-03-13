package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 11/05/2018.
 */
public class Usage implements Serializable {
    private Integer id;
    private Integer animals;
    private Integer farms;
    private Integer people;
    private Integer waterpointId;
    private String addedBy;
    private String date;

    public Usage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnimals() {
        return animals;
    }

    public void setAnimals(Integer animals) {
        this.animals = animals;
    }

    public Integer getFarms() {
        return farms;
    }

    public void setFarms(Integer farms) {
        this.farms = farms;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getWaterpointId() {
        return waterpointId;
    }

    public void setWaterpointId(Integer waterpointId) {
        this.waterpointId = waterpointId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }
}
