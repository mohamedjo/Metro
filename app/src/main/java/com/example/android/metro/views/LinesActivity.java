package com.example.android.metro.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.metro.R;
import com.example.android.metro.Utilities.LinesUtilities;
import com.example.android.metro.models.Station;

import java.util.List;

/**
 * Created by HP on 9/30/2018.
 */


public class LinesActivity  extends AppCompatActivity{

    public static final String EXTRA_NUMBER_OF_LINE="extra_number_of_line";


// this to decide get any arrayList to show


    TextView textViewStations;
    List<Station> stationsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lines);
        textViewStations =findViewById(R.id.text_view_stations);
        Intent i=getIntent();

        // assign from intent which opens the activity
      int  lineNumber=i.getIntExtra(EXTRA_NUMBER_OF_LINE,1);

        showLine(lineNumber);






    }

    // this method take the number of the line then get the aproppriate list
    private void  showLine(int lineNumber){
        switch (lineNumber){

            case 1:
                stationsList=LinesUtilities.getLine1();
                textViewStations.setBackgroundResource(R.drawable.line1_coloers);
                showHandling(stationsList);
                break;
            case 2:
                stationsList=LinesUtilities.getLine2();
                textViewStations.setBackgroundResource(R.drawable.line2_colors);
                showHandling(stationsList);
                break;
            case 3:
                stationsList=LinesUtilities.getLine3();
                textViewStations.setBackgroundResource(R.drawable.line3_colors);

                showHandling(stationsList);
                break;
        }


    }


    // this method take the list and append te stations to the textView
    private void showHandling(List<Station> stations){

        int size=stations.size();

        for(int i=0;i<size;i++){
            textViewStations.append(stations.get(i).getName()+"\n\n");


        }


    }


}
