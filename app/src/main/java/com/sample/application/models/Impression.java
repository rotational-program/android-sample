package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class Impression implements Serializable {
    private int id;
    private int waterpointId;
    private long date;
    private String addedBy;
    private String impression;

    public Impression() {
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }
}

