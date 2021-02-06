package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private final double value;
    private final Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrencyCode() {
        return this.currency.getCurrencyCode();
    }

    public Currency getCurrency() {
        return currency;
    }
}
