package com.example.android.metro.views;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.metro.R;
import com.example.android.metro.Utilities.LinesUtilities;
import com.example.android.metro.models.Station;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

/**
 * Created by HP on 10/14/2018.
 */

public class NearestStationActivity extends AppCompatActivity  implements OnMapReadyCallback{
    private static final String TAG = "NearestStationActivity";
    private TextView tvShowNearestStation;
    private  TextView tvDestance;
    private int PLACE_PICKER_REQUEST = 1;
    private GoogleMap map;
    private double latitude ;
    private double longtude ;
    private LatLng placeLatLng;
    private String placeTittle;
    private String stationTittle;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_station);
        tvShowNearestStation = findViewById(R.id.tvShowNearestStation);
        tvDestance=findViewById(R.id.tvDestance);
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

        try {
            Toast.makeText(this, "select place", Toast.LENGTH_LONG).show();
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        map.getUiSettings().setZoomControlsEnabled(true);
        moveCamera(latitude,longtude);

    }
    private void initMap(){
        Log.d(TAG, "initMap: initiliting the map");
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }

    private void moveCamera(double lat,double lng) {

        LatLng latlng=new LatLng(lat,lng);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng,14));

        MarkerOptions stationMarker=new MarkerOptions();
        stationMarker.title(stationTittle);
        stationMarker.position(latlng);
        map.addMarker(stationMarker);



        MarkerOptions placeMarker=new MarkerOptions();
        placeMarker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        placeMarker.title(placeTittle);
        placeMarker.position(placeLatLng);
        map.addMarker(placeMarker);

    }
    public void onClick(View v){
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

        try {
            Toast.makeText(this, "select place", Toast.LENGTH_LONG).show();
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST && resultCode == RESULT_OK) {
            Place place = PlacePicker.getPlace(this, data);

            if (place != null) {
                LatLng latLng = place.getLatLng();
                Location location1OfPlace = new Location("" + place.getName());
                location1OfPlace.setLatitude(latLng.latitude);
                location1OfPlace.setLongitude(latLng.longitude);

                Station nearestStation = getNearestStation(location1OfPlace);

                latitude = nearestStation.getLatitude();
                longtude = nearestStation.getLongtude();

                MarkerOptions markeroption=new MarkerOptions();

                placeLatLng=latLng;
                stationTittle=nearestStation.getName();
                placeTittle=place.getName().toString();
                Location stationLocation =new Location(stationTittle);
                stationLocation.setLatitude(latitude);
                stationLocation.setLongitude(longtude);

               float distance= location1OfPlace.distanceTo(stationLocation);


                initMap();

                tvShowNearestStation.setText(nearestStation.getName());
                tvDestance.setText(distance/1000+"km");


                //  tvShowNearestStation.setText(nearestStation.getName());


            }


        }


    }

    // thes method return the nearst station from all the stations
    public static Station getNearestStation(Location locationOfPlace) {
        List<Station> stationList = LinesUtilities.getStationsSet();
        Station nearestStation = new Station();
        double minimum = 10000000000000.0;
        Location location = new Location("locaton");
        for (int i = 0; i < stationList.size(); i++) {
            location.setLatitude(stationList.get(i).getLatitude());
            location.setLongitude(stationList.get(i).getLongtude());
            double distance = locationOfPlace.distanceTo(location);
            if (distance < minimum) {
                minimum = distance;
                nearestStation = stationList.get(i);

            }


        }
        return nearestStation;


    }


}
