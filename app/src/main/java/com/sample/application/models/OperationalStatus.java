package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class OperationalStatus implements Serializable {

    private int id;
    private int waterpointId;

    private String addedBy;
    private String date;
    private String meteroperationalstatus;
    private String waterpointstatus;

    public OperationalStatus() {
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

    public String getMeteroperationalstatus() {
        return meteroperationalstatus;
    }

    public void setMeteroperationalstatus(String meteroperationalstatus) {
        this.meteroperationalstatus = meteroperationalstatus;
    }

    public String getWaterpointstatus() {
        return waterpointstatus;
    }

    public void setWaterpointstatus(String waterpointstatus) {
        this.waterpointstatus = waterpointstatus;
    }
}
