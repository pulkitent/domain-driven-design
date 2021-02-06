package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private int value;
    private Currency currency;

    public Price(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public String getCurrencyCode() {
        return this.currency.getCurrencyCode();
    }
}
