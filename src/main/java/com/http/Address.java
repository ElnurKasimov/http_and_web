package com.http;

public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "\t\"address\": {\n" +
                "\t\t\"street=\"" + street + "\",\n" +
                "\t\t\"suite=\"" + suite + "\",\n" +
                "\t\t\"city=\"" + city + "'\",\n" +
                "\t\t\"zipcode=\"" + zipcode + "\",\n" +
                geo.toString() + "\n" +
               "\t},\n";
    }
}
