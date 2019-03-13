package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class Manager implements Serializable {
    private int id;
    private int waterpointId;
    private String addedBy;
    private String date;
    private String name;

    public Manager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaterpointId() {
        return waterpointId;
    }

    public void setWaterpointId(int waterpointId) {
        this.waterpointId = waterpointId;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
