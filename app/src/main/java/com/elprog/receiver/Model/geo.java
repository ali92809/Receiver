package com.elprog.receiver.Model;


public class geo  {
    private String lat,lng;

    public geo() {

    }

    public geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }



    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }


}
