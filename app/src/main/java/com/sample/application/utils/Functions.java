package com.sample.application.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.sample.application.R;
import com.sample.application.models.County;
import com.sample.application.models.WaterPoint;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.android.volley.VolleyLog.TAG;

/**
 * A class that specifies all the re-usable functions within the project
 */

public class Functions
{

    public static boolean isAuthenticatedUser(Context context){
        return Functions.readBooleanSharedPreferences(context, Constants.LOGIN,
                false);
    }

    public static boolean isCountyOfficer(Context context) {
        return Functions.readBooleanSharedPreferences(context, Constants.CAN_ADD_WATER_POINT,
                false);
    }

    public static boolean canAddReport(Context context) {
        return Functions.readBooleanSharedPreferences(context, Constants.CAN_ADD_REPORT,
                false);
    }

    public static String getUserId(Context context) {
        return Functions.readStringSharedPreferences(context, Constants.USER_ID,
                null);
    }

    /* App shared preferences: read */
    public static boolean readBooleanSharedPreferences(Context context, String key, boolean defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    /* App shared preferences: write */
    public static void writeBooleanSharedPreferences(Context context, String key, boolean value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    /* App shared preferences: read */
    public static int readIntSharedPreferences(Context context, String key, int defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, defaultValue);
    }

    /* App shared preferences: write */
    public static void writeIntSharedPreferences(Context context, String key, int value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    /* App shared preferences: read */
    public static String readStringSharedPreferences(Context context, String key, String defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }

    /* App shared preferences: read */
    public static long readLongSharedPreferences(Context context, String key, long defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, defaultValue);
    }

    /* App shared preferences: write */
    public static void writeStringSharedPreferences(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    /* App shared preferences: write */
    public static void writeLongSharedPreferences(Context context, String key, Long value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static void clearSharedPreferences(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.APP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().commit();
    }

    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }

    /* Verifies an email address */
    public static boolean isEmailValid(String email) {
        if(email != null){
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
        return false;
    }

    /* Verifies a password */
    public static boolean isPasswordValid(String password) {
        return password.matches(("(?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40}"));
    }

    /* Verifies the mobile phone number */
    public static boolean isMobilePhoneValid(String mobilePhone) {
        return mobilePhone.matches("^2547[0-9]{8}$") || mobilePhone.matches("^\\+2547[0-9]{8}$")
                || mobilePhone.matches("^7[0-9]{8}$") || mobilePhone.matches("^07[0-9]{8}$");
    }

    /* Append 254 to a mobile phone number */
    public static String get254MobilePhone(String mobilePhone){
        int length = mobilePhone.length();
        switch (length){
            case 9:
                return Constants.COUNTRY_CODE + mobilePhone;
            case 10:
                return Constants.COUNTRY_CODE + getExcerpt(mobilePhone, "0");
            case 12:
                return mobilePhone;
            case 13:
                return getExcerpt(mobilePhone, "+");
            default:
                return mobilePhone;
        }
    }

    /* Trim the mobile phone number to 7XXXXXXX */
    private static String getExcerpt(String mobilePhone, String i){
        return mobilePhone.substring(mobilePhone.indexOf(i)+1);
    }

    public static String getFormattedPayload(String val){
        if(TextUtils.isEmpty(val)){
            return null;
        }
        return val;
    }

    public static void displayTempSnackBar(View view, String message){
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }

    public static void displaySnackBar(View view, String message){
        Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DO nothing
            }
        }).show();
    }

    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }



    public static void popFragment(FragmentManager fragmentManager, String identifier){
        fragmentManager.popBackStack(identifier, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }


    /* Convert the string to title case */
    public static String toTitleCase(String str) {

        if (str == null) {
            return null;
        }

        boolean space = true;
        StringBuilder builder = new StringBuilder(str);
        final int len = builder.length();

        for (int i = 0; i < len; ++i) {
            char c = builder.charAt(i);
            if (space) {
                if (!Character.isWhitespace(c)) {
                    // Convert to title case and switch out of whitespace mode.
                    builder.setCharAt(i, Character.toTitleCase(c));
                    space = false;
                }
            } else if (Character.isWhitespace(c)) {
                space = true;
            } else {
                builder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        return builder.toString();
    }

    public static List<String> getYears() {
        List<String> list = new ArrayList<>();
        list.add("Year");
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 1950; i <= currentYear; i++) {
            list.add(Integer.toString(i));
        }

        return list;
    }

    public static int getInteger(String val){
        if(!TextUtils.isEmpty(val)){
            return Integer.parseInt(val);
        }
        return -1;
    }

    public static String getUnixTimeStamp(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        return formattedDate;
    }

    public static String getUnixTimeStamp(long time){
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        return formattedDate;
    }

    public static Long getUnixTimeStamp(String str){
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(str);
            Timestamp timeStampDate = new Timestamp(date.getTime());

            return timeStampDate.getTime();
        } catch (ParseException e) {
            System.out.println("Exception :" + e);
            return null;
        }
    }

    public static String getFormattedDouble (Double val){
        DecimalFormat f = new DecimalFormat("0.000");
        if(val != null){
            return f.format(val);
        }
        return null;
    }

    public static String getFormattedDoubleForDistances(Double val){
        DecimalFormat f1 = new DecimalFormat("0");
        DecimalFormat f2 = new DecimalFormat("0.0");
        if(val != null){
            if(val % 1 == 0){
                return f1.format(val);
            }else{
                //return f2.format(val);
                return String.valueOf(val);
            }
        }
        return null;
    }

    public static String convertDouble2String(Double val){
        if(val != null){
            return String.valueOf(val);
        }
        return null;
    }

    public static String convertInt2String(Integer val){
        if(val != null){
            return String.valueOf(val);
        }
        return null;
    }

    public static Double convertString2Double(String val){
        if(TextUtils.isEmpty(val)){
            return null;
        }
        return Double.parseDouble(val);
    }

    public static Integer convertString2Int(String val){
        if(TextUtils.isEmpty(val)){
            return null;
        }
        return Integer.parseInt(val);
    }

    public static String getString(Double val){
        DecimalFormat f = new DecimalFormat("0");
        if(val != null){
            return f.format(val);
        }
        return "";
    }

    public static String getValue(String val) {
        if(TextUtils.isEmpty(val)){
            return null;
        }
        return val;
    }

    public static Double getDoubleValue(String val) {
        if(TextUtils.isEmpty(val)){
            return null;
        }
        return Double.parseDouble(val);
    }

    public static String getArea(List<County> counties) {
        int size = counties.size();
        switch(size){
            case 1:
                return counties.get(0).getName();
                default:
                    return Constants.KENYA;
        }
    }

    public static County getCounty(List<County> counties) {
        int size = counties.size();
        switch(size){
            case 1:
                return counties.get(0);
            default:
                return null;
        }
    }

    public static Date getDate(long timestamp){
        Date date = new Date(timestamp);
        return date;
    }

    public static String getFormattedDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String formattedDate = sdf.format(date);
        Log.e(TAG, formattedDate);
        return formattedDate;
    }

    public static String getFormattedDate(String string){
        if(string!= null){
            return string;
        }
        return "";
    }

    public static int getStatusIcon(String status){
        switch (status){
            case "Functional":
                return R.drawable.circle_green;
            case "Non-functional":
                return R.drawable.circle_red;
            case "Functional-saline":
                return R.drawable.circle_green;
            default:
                return R.drawable.circle;
        }
    }

    public static String loadJSONFromAsset(Activity activity, String file) {
        String json = null;
        try {
            InputStream is = activity.getAssets().open(file);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public static String getOperationalStatus(String str){
        if(str != null){
            return str;
        }
        return "-";
    }

    public static JSONArray getJSONArray(String str){
        try
        {
            return new JSONArray(str);
        }
        catch (JSONException e){
            e.printStackTrace();
        }
        return null;
    }


    public static JSONObject getAddWaterPointPayLoad(WaterPoint waterPoint){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(Constants.ADDED_BY_ID, waterPoint.getAddedById());
            jsonObject.put(Constants.BH_YIELD, waterPoint.getBhyield());
            jsonObject.put(Constants.CAPACITY, waterPoint.getCapacity());
            jsonObject.put(Constants.COUNTY_ID, waterPoint.getCounty().getId());
            jsonObject.put(Constants.DEPTH, waterPoint.getDepth());
            jsonObject.put(Constants.DISTANCE_FROM_CC, waterPoint.getDistancefromcountycenter());
            jsonObject.put(Constants.FUNDING_ORG_ID, waterPoint.getFundingorgId());
            jsonObject.put(Constants.LATITUDE, waterPoint.getLat());
            jsonObject.put(Constants.LONGITUDE, waterPoint.getLon());
            jsonObject.put(Constants.METER_AVAILABILITY, waterPoint.isMeteravailability());
            jsonObject.put(Constants.NAME, waterPoint.getName());
            jsonObject.put(Constants.QUANTITY, waterPoint.getQuantity());
            jsonObject.put(Constants.RELIABILITY, waterPoint.getReliability());
            jsonObject.put(Constants.RURAL_URBAN, waterPoint.getRuralurban());
            jsonObject.put(Constants.STATUS, waterPoint.getStatus());
            jsonObject.put(Constants.TELECOM_CARRIER, waterPoint.getTelecomcarrier());
            jsonObject.put(Constants.TOWN, waterPoint.getTown());
            jsonObject.put(Constants.WARD_ID, waterPoint.getWard().getId());
            jsonObject.put(Constants.WATER_QUALITY, waterPoint.getWaterquality());
            jsonObject.put(Constants.WATER_RETRIEVAL_MEANS, waterPoint.getWaterretrievalmeans());
            jsonObject.put(Constants.WEB_PAGE_LOAD, waterPoint.isWebpageload());
            jsonObject.put(Constants.WATER_POINT_TYPE_ID, waterPoint.getWaterpointType().getId());
            jsonObject.put(Constants.YEAR_OF_CONSTRUCTION, waterPoint.getYearofconstruction());
        } catch (JSONException je) {
            Log.e(TAG, "JSONObject for add water point payload is not valid" + je.getMessage());
        }
        return jsonObject;
    }
}
