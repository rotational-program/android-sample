package com.sample.application.network;

import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.sample.application.utils.ApplicationController;
import com.sample.application.utils.Constants;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * A network class that performs all the GET requests to the API server
 */
public class GETRequest {
    private static final String TAG = GETRequest.class.getSimpleName();
    private RequestQueue requestQueue;

    public GETRequest() {
        requestQueue = ApplicationController.getApplicationController().getRequestQueue();
    }

    /* Network Requests */
    public void networkRequest(final String url, final VolleyResponse volleyResponse) {
        Log.d(TAG, "Requesting from: " + url);
        JsonObjectRequest requestObject = new JsonObjectRequest(Request.Method.GET, url,
                null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsnResponse) {
                Log.d(TAG, "URL " + url);

                if (jsnResponse.has(Constants.SUCCESS)) {
                    try {
                        volleyResponse.onSuccessResponse(jsnResponse);
                    } catch (JSONException | IOException e) {
                        Log.e(TAG, e.getMessage());
                    }
                } else {
                    try {
                        volleyResponse.onErrorResponse(jsnResponse.getInt(Constants.STATUS_CODE), jsnResponse.getString(Constants.STATUS_MESSAGE));
                    } catch (JSONException e) {
                        Log.e(TAG, e.getMessage());
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

                if (volleyError.networkResponse != null && volleyError.networkResponse.data != null) {
                    final int statusCode = volleyError.networkResponse.statusCode;
                    byte[] serverResponse = volleyError.networkResponse.data;
                    volleyError = new VolleyError(new String(serverResponse, StandardCharsets.UTF_8));
                    Log.e(TAG, volleyError.getMessage());
                    final String message = getNetworkErrorMessage(volleyError);
                    volleyResponse.onErrorResponse(statusCode, message);
                } else {
                    if (volleyError.getCause() != null) {
                        volleyResponse.onErrorResponse(500, volleyError.getCause().getLocalizedMessage());
                    } else {
                        volleyResponse.onErrorResponse(500, volleyError.getLocalizedMessage());
                    }
                }
            }
        }) {
        };

        requestObject.setRetryPolicy(new DefaultRetryPolicy(0, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        requestQueue.add(requestObject);
    }

    private String getNetworkErrorMessage(VolleyError volleyError) {
        String message = "An error occurred";

        try {
            JSONObject jsonObject = new JSONObject(volleyError.getMessage());

            if (jsonObject.has(Constants.STATUS_MESSAGE)) {
                message = jsonObject.getString(Constants.STATUS_MESSAGE);
            }

            if (jsonObject.has(Constants.MESSAGE)) {
                message = jsonObject.getString(Constants.MESSAGE);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return message;
    }
}