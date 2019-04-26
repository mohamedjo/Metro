package com.example.android.metro.views;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import com.example.android.metro.R;
import com.example.android.metro.Utilities.LinesUtilities;
import com.example.android.metro.models.Station;
import com.example.android.metro.models.StationsAdapter;

import java.util.List;

/**
 * Created by HP on 10/5/2018.
 */

public class StationsLocationActivity extends AppCompatActivity implements StationsAdapter.ClickListener {

    private List<Station> stationListLine1;
    private RecyclerView rv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_locaton);
        rv = findViewById(R.id.rv);
        stationListLine1 = LinesUtilities.getStationsSet();
        StationsAdapter adapter = new StationsAdapter(stationListLine1);
        adapter.setClickListener(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);

        rv.setAdapter(adapter);
        rv.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });


    }

    @Override
    public void itemClicked(int postion) {
        Station station = stationListLine1.get(postion);
        String searchName = station.getSearchName();
        Uri mapUri = Uri.parse("geo:0,0?q=" + searchName + "&z=20");


        double lat =  station.getLatitude();
        double lng =  station.getLongtude();
        Intent intent = new Intent(StationsLocationActivity.this, MapActivity.class);
        intent.putExtra(MapActivity.EXTRA_LATITUDE,lat);
        intent.putExtra(MapActivity.EXTRA_LONGTUDE,lng);

        startActivity(intent);


        // open map appp
      /*  Intent intent=new Intent(Intent.ACTION_VIEW,mapUri);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"you need map app",Toast.LENGTH_LONG).show();
        }*/

    }
}
