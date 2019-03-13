package com.sample.application.models;

import java.io.Serializable;

/**
 * Created by Peninah Waweru on 16/05/2018.
 */
public class PaymentManager implements Serializable {
    private int id;
    private int waterpointId;
    private String date;
    private String addedBy;
    private String paymentmanager;
    private String paymentmethod;
    private String recordofpayment;

    public PaymentManager() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getPaymentmanager() {
        return paymentmanager;
    }

    public void setPaymentmanager(String paymentmanager) {
        this.paymentmanager = paymentmanager;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getRecordofpayment() {
        return recordofpayment;
    }

    public void setRecordofpayment(String recordofpayment) {
        this.recordofpayment = recordofpayment;
    }
}
