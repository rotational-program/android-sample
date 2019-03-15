package com.sample.application;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.application.adapters.WaterPointsAdapter;
import com.sample.application.models.WaterPoint;
import com.sample.application.network.CommunicationManager;
import com.sample.application.network.GETRequest;
import com.sample.application.network.VolleyResponse;
import com.sample.application.utils.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private RecyclerView waterPointList;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        waterPointList = view.findViewById(R.id.water_point_list);
        Button byCounty = view.findViewById(R.id.by_county);

        byCounty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "To be implemented", Toast.LENGTH_SHORT).show();

                CountyWaterPoints fragment = CountyWaterPoints.newInstance();

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                fm.popBackStack();
                transaction.add(R.id.fragment, fragment);
                transaction.commit();
            }
        });


        waterPointList.setHasFixedSize(true);
        waterPointList.setLayoutManager(new LinearLayoutManager(getActivity()));

        loadWaterPoints();

        return view;
    }

    private void loadWaterPoints() {
        GETRequest getRequest = new GETRequest();

        final ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading water points...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        getRequest.networkRequest(CommunicationManager.WATER_POINTS_URL, new VolleyResponse() {
            @Override
            public void onSuccessResponse(JSONObject response) throws JSONException, IOException {
                JSONArray data = response.getJSONArray(Constants.DATA);
                List<WaterPoint> waterPoints = getWaterPoints(data);

                WaterPointsAdapter adapter = new WaterPointsAdapter(waterPoints, getActivity());
                waterPointList.setAdapter(adapter);
                progressDialog.cancel();
            }

            @Override
            public void onErrorResponse(int statusCode, String errorResponse) {
                Toast.makeText(getActivity(), errorResponse, Toast.LENGTH_LONG).show();
                progressDialog.cancel();
            }
        });
    }

    private List<WaterPoint> getWaterPoints(JSONArray jsonArray) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return objectMapper.readValue(jsonArray.toString(), new TypeReference<List<WaterPoint>>() {
        });
    }
}
