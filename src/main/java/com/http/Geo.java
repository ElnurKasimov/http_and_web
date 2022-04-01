package com.http;

public class Geo {
    private String lat;
    private String lng;

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

    public static class Builder {
        private final Geo newGeo;

        public Builder() {
            newGeo = new Geo();
        }

        public Builder withLat(String lat) {
            newGeo.lat = lat;
            return this;
        }

        public Builder withLng(String lng) {
            newGeo.lng = lng;
            return this;
        }

        public Geo build() {
            return newGeo;
        }
    }

    @Override
    public String toString() {
        return "\t\t\"geo\": {\n" +
                "\t\t\t\"lat=\": " + lat + "\",\n" +
                "\t\t\t\"lng=\": " + lng + "\"\n" +
                "\t\t}";
    }
}
