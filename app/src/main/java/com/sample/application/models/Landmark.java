package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class Landmark implements Serializable {

    private int id;
    private int waterpointId;
    private String date;
    private String addedBy;
    private String landmark;

    public Landmark() {
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

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
