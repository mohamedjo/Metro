package com.example.android.metro.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.metro.R;

public class MainActivity extends AppCompatActivity {

    TextView textViewLines;
    TextView textViewfromTo;
    TextView textViewStationsLocation;
    TextView textViewNearestStation;
    TextView textViewNearestToMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewLines =findViewById(R.id.textViewLins);
        textViewLines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ChoseLineActivity.class);
                   startActivity(intent);
            }
        });
        textViewfromTo=findViewById(R.id.textViewFromTo);
        textViewfromTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FromTOActivity.class);
                startActivity(intent);
            }
        });

        textViewStationsLocation=findViewById(R.id.textViewstationsLocation);
        textViewStationsLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,StationsLocationActivity.class);
                startActivity(intent);
            }
        });
        textViewNearestStation=findViewById(R.id.textViewsNearestStation);
        textViewNearestStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NearestStationActivity.class);
                startActivity(intent);
            }
        });




        textViewNearestToMe=findViewById(R.id.textViewsNearestToMe);
        textViewNearestToMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NearFromMeActivity.class);
                startActivity(intent);
            }
        });

    }



}
