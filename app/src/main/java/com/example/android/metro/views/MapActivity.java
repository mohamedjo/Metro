package com.example.android.metro.views;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.android.metro.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {


    private static final String TAG = "MapActivity";
    private static final float DEFULT_ZOOM = 15;
    private double latitude = 0;
    private double longtude = 0;
    public static final String EXTRA_LATITUDE = "latitude";
    public static final String EXTRA_LONGTUDE = "longtude";

    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;

    private boolean isLocationPrimmisionGranted = false;

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Intent i = getIntent();
        // grt the location from the activity the start map activity
        latitude = i.getDoubleExtra(EXTRA_LATITUDE, 31);
        longtude = i.getDoubleExtra(EXTRA_LONGTUDE, 31);

        initMap();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap=googleMap;
        moveCamera(latitude,longtude);

        Toast.makeText(this, "map is Ready "+longtude, Toast.LENGTH_SHORT).show();
    }

    //to move the map to spsfic location;
    private void moveCamera(double lat,double lng) {

        LatLng latlng=new LatLng(lat,lng);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng,15));

        MarkerOptions marker=new MarkerOptions();

        marker.position(latlng);
        mMap.addMarker(marker);



    }

    private void initMap(){
        Log.d(TAG, "initMap: initiliting the map");
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    /*
    private void getLocationPrimisson() {
        Log.d(TAG, "getLocationPrimisson: cheack the permissions");
        String[] prrmissions = new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION};


        if (ActivityCompat.checkSelfPermission(this, FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.checkSelfPermission(this, COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                isLocationPrimmisionGranted = true;
                initMap();

            } else {
                ActivityCompat.requestPermissions(this, prrmissions, LOCATION_PERMISSION_REQUEST_CODE);
            }

        } else {
            ActivityCompat.requestPermissions(this, prrmissions, LOCATION_PERMISSION_REQUEST_CODE);

        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {

            case LOCATION_PERMISSION_REQUEST_CODE:
                isLocationPrimmisionGranted = false;
                if (grantResults.length > 0) {
                    for (int i = 0; i < grantResults.length; i++) {

                        if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {

                            isLocationPrimmisionGranted = false;
                            Log.d(TAG, "onRequestPermissionsResult: permission denied");
                            return;
                        }
                    }
                    isLocationPrimmisionGranted = true;
                    initMap();
                    Log.d(TAG, "onRequestPermissionsResult: permission granted");
                }
        }
    }*/

}
