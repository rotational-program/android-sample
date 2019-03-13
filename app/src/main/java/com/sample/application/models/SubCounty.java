package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class SubCounty implements Serializable {
    private int id;
    private String name;
    private County county;

    public SubCounty() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return name;
    }
}
