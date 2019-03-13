package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class County implements Serializable {
    private int id;
    private String name;

    public County() {
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

    @Override
    public String toString() {
        return name;
    }
}
