package com.sample.application.network;

/**
 * A class that contains all the network call urls
 */

public class CommunicationManager {

    private static String BASE_URL = "https://kenya-rapid-app-server-dev.mybluemix.net";

    public static final String WATER_POINTS_URL =  BASE_URL + "/waterpoints";
    public static final String WATER_POINTS_BY_COUNTY_URL = WATER_POINTS_URL + "/listByCounty/";

}
