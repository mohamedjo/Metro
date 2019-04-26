package com.example.android.metro.models;

/**
 * Created by HP on 10/1/2018.
 */

public class Station {



   private String name;
    private int line;
    private double latitude;
    private double longtude;


    private String searchName;


    public Station() {
    }

    public Station( String name,int line) {
        this.line = line;
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtude() {
        return longtude;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }

    public Station(String name, int line, String searchName) {
        this.line = line;
        this.name = name;
        this.searchName=searchName;
    }
    public Station( String name,int line,String searchName,double latitude,double longtude) {
        this.line = line;
        this.name = name;
        this.searchName=searchName;
        this.latitude=latitude;
        this.longtude=longtude;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
