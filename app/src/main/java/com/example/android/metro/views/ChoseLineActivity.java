package com.example.android.metro.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.metro.R;

/**
 * Created by HP on 9/30/2018.
 */

public class ChoseLineActivity extends AppCompatActivity implements View.OnClickListener {
    private  Button button1;
    private  Button button2;
    private  Button button3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_line);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent=new Intent(ChoseLineActivity.this,LinesActivity.class);
        switch (view.getId()){
            case R.id.button1:
                intent.putExtra(LinesActivity.EXTRA_NUMBER_OF_LINE,1);
                startActivity(intent);
                break;
            case R.id.button2:
                intent.putExtra(LinesActivity.EXTRA_NUMBER_OF_LINE,2);
                startActivity(intent);
                break;
            case R.id.button3:
                intent.putExtra(LinesActivity.EXTRA_NUMBER_OF_LINE,3);
                startActivity(intent);
                break;


        }


    }
}
