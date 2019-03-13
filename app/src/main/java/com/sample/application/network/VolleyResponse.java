package com.sample.application.network;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Peninah Waweru on 28/05/2018.
 */
public interface VolleyResponse {

    void onSuccessResponse(JSONObject response) throws JSONException, IOException;

    void onErrorResponse(int statusCode, String errorResponse);
}
