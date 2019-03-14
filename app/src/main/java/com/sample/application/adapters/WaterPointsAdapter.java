package com.sample.application.adapters;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sample.application.R;
import com.sample.application.models.WaterPoint;
import com.sample.application.utils.Functions;

import java.util.List;

/**
 * Created by violetteogega on 10/04/2018.
 */

public class WaterPointsAdapter extends RecyclerView.Adapter<WaterPointsAdapter.WaterPointViewHolder> {
    private static int currentPosition = 0;
    private List<WaterPoint> waterPointList;
    private FragmentActivity activity;

    public WaterPointsAdapter(List<WaterPoint> waterPointList, FragmentActivity activity) {
        this.waterPointList = waterPointList;
        this.activity = activity;
    }

    @Override
    public WaterPointViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_water_point, parent, false);
        return new WaterPointViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final WaterPointViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        WaterPoint waterPoint = waterPointList.get(position);

        String waterPointType = waterPoint.getWaterpointType() == null
                ? "-" : waterPoint.getWaterpointType().getTypename();
        String operationalStatus = waterPoint.getOperationalStatus() == null
                ? "-" : waterPoint.getOperationalStatus().getWaterpointstatus();

        String town = waterPoint.getTown() == null ? "-" : waterPoint.getTown();

        holder.wpNameView.setText(waterPoint.getName());
        holder.wpTypeName.setText(waterPointType);
        holder.wpFunctionalStatus.setText(operationalStatus);
        holder.wpTown.setText(town);
        holder.wpFunctionalStatusIcon.setImageDrawable(activity.getResources()
                .getDrawable(Functions.getStatusIcon(operationalStatus)));
    }

    @Override
    public int getItemCount() {
        return waterPointList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class WaterPointViewHolder extends RecyclerView.ViewHolder {
        ImageView wpFunctionalStatusIcon;
        TextView wpNameView, wpTypeName, wpFunctionalStatus, wpTown;
        LinearLayout layout;

        WaterPointViewHolder(View itemView) {
            super(itemView);

            wpNameView = itemView.findViewById(R.id.wp_name);
            wpTown = itemView.findViewById(R.id.town);
            wpTypeName = itemView.findViewById(R.id.wp_type);
            wpFunctionalStatus = itemView.findViewById(R.id.status);
            wpFunctionalStatusIcon = itemView.findViewById(R.id.status_icon);
            layout = itemView.findViewById(R.id.layout);
        }
    }

}
