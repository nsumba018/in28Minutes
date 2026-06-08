package com.rab;

public class Address {
    private String line1;
    private String city;
    private Integer zip;

    public Address(String line1, String city, Integer zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return line1 + " " + city + " " + zip;
    }
}
