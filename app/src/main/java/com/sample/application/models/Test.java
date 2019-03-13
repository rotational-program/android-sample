package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class Test implements Serializable {
    private int id;
    private int waterpointId;
    private String addedBy;
    private String date;
    private String testresults;
    private String testsdone;

    public Test() {
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

    public String getTestresults() {
        return testresults;
    }

    public void setTestresults(String testresults) {
        this.testresults = testresults;
    }

    public String getTestsdone() {
        return testsdone;
    }

    public void setTestsdone(String testsdone) {
        this.testsdone = testsdone;
    }
}
