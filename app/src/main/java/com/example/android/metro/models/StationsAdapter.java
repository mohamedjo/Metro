package com.example.android.metro.models;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.metro.R;

import java.util.List;

/**
 * Created by HP on 10/5/2018.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationsAdapter.StationHolder> {
    List<Station> stationList;
    ClickListener clickListener;

    public StationsAdapter(List<Station> stationList) {
        this.stationList = stationList;
    }


    public void setClickListener (ClickListener clickListener){

        this.clickListener=clickListener;
    }
    @NonNull
    @Override
    public StationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent,false);
        return new StationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StationHolder holder, int position) {
        Station station=stationList.get(position);
        holder.textViewName.setText(station.getName());

    }








    @Override
    public int getItemCount() {
        return stationList.size();
    }

    public class StationHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        public TextView textViewName;

        public StationHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textViewName=itemView.findViewById(R.id.textViewName);

        }

        @Override
        public void onClick(View view) {

            clickListener.itemClicked(getAdapterPosition());
        }


    }
    public interface ClickListener{

        public void itemClicked(int postion);
    }
}
