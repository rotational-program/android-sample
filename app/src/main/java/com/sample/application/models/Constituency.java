package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class Constituency implements Serializable {
    private int id;
    private String name;
    private SubCounty subCounty;

    public Constituency() {
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

    public SubCounty getSubCounty() {
        return subCounty;
    }

    public void setSubCounty(SubCounty subCounty) {
        this.subCounty = subCounty;
    }

    @Override
    public String toString() {
        return name;
    }
}
