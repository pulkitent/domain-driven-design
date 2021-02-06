package com.thoughtworks.ddd.domain;

public class Address {
    private String addressLineFirst;
    private String addressLineSecond;
    private String city;

    public Address(String addressLineFirst, String addressLineSecond, String city) {
        this.addressLineFirst = addressLineFirst;
        this.addressLineSecond = addressLineSecond;
        this.city = city;
    }
}
