package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class Ward implements Serializable {
    private int id;
    private String name;
    private Constituency constituency;

    public Ward() {
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

    public Constituency getConstituency() {
        return constituency;
    }

    public void setConstituency(Constituency constituency) {
        this.constituency = constituency;
    }

    @Override
    public String toString() {
        return name;
    }
}

