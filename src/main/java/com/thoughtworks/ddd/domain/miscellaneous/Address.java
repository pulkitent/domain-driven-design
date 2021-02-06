package com.thoughtworks.ddd.domain.miscellaneous;

public class Address {
    private final String addressLineFirst;
    private final String addressLineSecond;
    private final String city;

    public Address(String addressLineFirst, String addressLineSecond, String city) {
        this.addressLineFirst = addressLineFirst;
        this.addressLineSecond = addressLineSecond;
        this.city = city;
    }
}
