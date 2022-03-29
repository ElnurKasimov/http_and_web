package com.http;

public class Geo {
    String lat;
    String lng;

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

    @Override
    public String toString() {
        return "\t\t\"geo\": {\n" +
                "\t\t\t\"lat=\": " + lat + "\",\n" +
                "\t\t\t\"lng=\": " + lng + "\"\n" +
                "\t\t}";
    }
}
