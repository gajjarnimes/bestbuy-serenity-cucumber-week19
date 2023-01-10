package com.bestbuy.model;

public class StorePojo {

    private String name;
    private String type;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private double lat;
    private double lng;
    private String hours;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getHours() {
        return this.hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public static StorePojo getRequestBody(String name, String type, String address, String address2, String city, String state, String zip,
                                           double lat, double lng, String hours, String createdAt, String updatedAt) {
        StorePojo storePojo = new StorePojo();
        if (name != null) {
            storePojo.setName(name);
        }
        if (type != null){
            storePojo.setType(type);
    }
        if (address!=null){
            storePojo.setAddress(address);
        }
        if (address2!=null){
            storePojo.setAddress2(address2);
        }
        if (city!=null){
            storePojo.setCity(city);
        }
        if(state!=null){
            storePojo.setState(state);
        }
        if(zip!=null){
            storePojo.setZip((zip));
        }
        if(lat!=lat){
            storePojo.setLat(lat);
        }
        if(lng!=lng){
            storePojo.setLng(lng);
        }
        if(hours!=null){
            storePojo.setHours(hours);
        }

        return storePojo;

    }

}





