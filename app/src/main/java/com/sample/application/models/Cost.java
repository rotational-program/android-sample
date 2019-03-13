package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 11/05/2018.
 */
public class Cost implements Serializable {
    private int id;
    private int waterpointId;
    private String date;
    private Double costpertwentyltrs;
    private Double dailycostpercamel;
    private Double dailycostpercow;
    private Double dailycostpergoat;
    private Double monthlyflatrate;
    private String addedBy;

    public Cost() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getCostpertwentyltrs() {
        return costpertwentyltrs;
    }

    public void setCostpertwentyltrs(Double costpertwentyltrs) {
        this.costpertwentyltrs = costpertwentyltrs;
    }

    public Double getDailycostpercamel() {
        return dailycostpercamel;
    }

    public void setDailycostpercamel(Double dailycostpercamel) {
        this.dailycostpercamel = dailycostpercamel;
    }

    public Double getDailycostpercow() {
        return dailycostpercow;
    }

    public void setDailycostpercow(Double dailycostpercow) {
        this.dailycostpercow = dailycostpercow;
    }

    public Double getDailycostpergoat() {
        return dailycostpergoat;
    }

    public void setDailycostpergoat(Double dailycostpergoat) {
        this.dailycostpergoat = dailycostpergoat;
    }

    public Double getMonthlyflatrate() {
        return monthlyflatrate;
    }

    public void setMonthlyflatrate(Double monthlyflatrate) {
        this.monthlyflatrate = monthlyflatrate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
