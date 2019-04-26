package com.example.android.metro.views;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.metro.R;
import com.example.android.metro.models.Station;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class NearFromMeActivity extends AppCompatActivity implements OnMapReadyCallback{
    private static final String TAG ="NearFromMeActivity";
    private TextView latitude;
    private TextView longitude;

    TextView textViewNearestStation;


    private FusedLocationProviderClient fusedLocationProviderClient;
    private static final int MY_PERMISSION_REQUEST_FINE_LOCATION = 101;
    private LocationRequest locationRequest;
    private LocationCallback locationCallback;
    GoogleMap map;
    LatLng myLocationLatlng;
    LatLng nearestStationLatlng;
    private Station nearestStation;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        map.getUiSettings().setZoomControlsEnabled(true);
        moveCamera();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_from_me);

        //initialuse View
        latitude = (TextView) findViewById(R.id.textViewlatitude);
        longitude = (TextView) findViewById(R.id.textViewLongtude);
        textViewNearestStation = (TextView) findViewById(R.id.textViewMyNearestStation);


        locationRequest = new LocationRequest();
        locationRequest.setInterval(1000*60*5); //use a value fo about 10 to 15s for a real app
        locationRequest.setFastestInterval(100*60*3);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);



        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {
                    if (location != null) {
                        latitude.setText(String.valueOf(location.getLatitude()));
                        longitude.setText(String.valueOf(location.getLongitude()));
                        myLocationLatlng=new LatLng(location.getLatitude(),location.getLongitude());

                        nearestStation=NearestStationActivity.getNearestStation(location);
                        nearestStationLatlng=new LatLng(nearestStation.getLatitude(),nearestStation.getLongtude());
                        textViewNearestStation.setText(nearestStation.getName());
                        initMap();
                    }
                }
            });
        } else {
            // request permissions
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_REQUEST_FINE_LOCATION);
            }
        }

        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                for (Location location : locationResult.getLocations()) {
                    //Update UI with location data
                    if (location != null) {
                        latitude.setText(String.valueOf(location.getLatitude()));
                        longitude.setText(String.valueOf(location.getLongitude()));
                        myLocationLatlng=new LatLng(location.getLatitude(),location.getLongitude());

                        nearestStation=NearestStationActivity.getNearestStation(location);
                        nearestStationLatlng=new LatLng(nearestStation.getLatitude(),nearestStation.getLatitude());
                        textViewNearestStation.setText(nearestStation.getName());
                        initMap();

                    }
                }
            }
        };

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case MY_PERMISSION_REQUEST_FINE_LOCATION:

                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //permission was granted do nothing and carry on

                } else {
                    Toast.makeText(getApplicationContext(), "This app requires location permissions to be granted", Toast.LENGTH_SHORT).show();
                    finish();
                }

                break;

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
         startLocationUpdates();
    }

    private void startLocationUpdates() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null);
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_REQUEST_FINE_LOCATION);
            }
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        stopLocationUpdates();
    }

    private void stopLocationUpdates() {
        fusedLocationProviderClient.removeLocationUpdates(locationCallback);
    }

    private  void initMap(){
        Log.d(TAG, "initMap: initiliting the map");
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    private void moveCamera() {

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(nearestStationLatlng,12));

        MarkerOptions stationMarker=new MarkerOptions();
        stationMarker.title(nearestStation.getName());
        stationMarker.position(nearestStationLatlng);
        map.addMarker(stationMarker);



        MarkerOptions placeMarker=new MarkerOptions();
        placeMarker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        placeMarker.title("my location");
        placeMarker.position(myLocationLatlng);
        map.addMarker(placeMarker);

    }



}