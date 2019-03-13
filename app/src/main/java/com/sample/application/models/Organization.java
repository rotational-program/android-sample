package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 27/04/2018.
 */
public class Organization implements Serializable {
    private String id;
    private String name;
    private String category;

    public Organization() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name;
    }
}
