package com.sample.application.models;

import java.io.Serializable;

public class InstrumentedWaterPoint implements Serializable {

    private int id;
    private Long siteId;
    private int waterpointId;

    public InstrumentedWaterPoint() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public int getWaterpointId() {
        return waterpointId;
    }

    public void setWaterpointId(int waterpointId) {
        this.waterpointId = waterpointId;
    }
}
