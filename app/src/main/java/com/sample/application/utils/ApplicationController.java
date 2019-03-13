package com.sample.application.utils;

import android.app.Application;

import com.android.volley.RequestQueue;

/**
 * A class that sets up the request queue and the database.
 */
public class ApplicationController extends Application {
    protected static final String TAG = ApplicationController.class.getSimpleName();
    private static ApplicationController applicationController;
    private RequestQueue requestQueue;

    public static synchronized ApplicationController getApplicationController() {
        return applicationController;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationController = this;

        /* Starts a request queue that will last the lifetime of the application */
        requestQueue = RequestQueueSingleton.getInstance(getApplicationContext())
                .getRequestQueue();
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}