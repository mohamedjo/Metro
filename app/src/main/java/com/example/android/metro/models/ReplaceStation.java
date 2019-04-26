package com.example.android.metro.models;

/**
 * Created by HP on 10/1/2018.
 */

public class ReplaceStation extends Station {
    int replaceLine;

    public ReplaceStation(String name,int line,int replaceLine){
        super(name,line);
        this.replaceLine=replaceLine;



    }
    public ReplaceStation(String name,int line,int replaceLine,String searshName){
        super(name,line,searshName);
        this.replaceLine=replaceLine;



    }
    public ReplaceStation(String name,int line,int replaceLine,String searshName,double latitude,double longtude){
        super(name,line,searshName,latitude,longtude);
        this.replaceLine=replaceLine;



    }


    public int getReplaceLine() {
        return replaceLine;
    }

    public void setReplaceLine(int replaceLine) {
        this.replaceLine = replaceLine;
    }
}
