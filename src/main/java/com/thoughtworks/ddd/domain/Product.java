package com.thoughtworks.ddd.domain;

import com.thoughtworks.ddd.domain.domain_service.CompetitorBasedPricer;

import java.util.Objects;
import java.util.UUID;

public class Product {
    private String id;
    private String name;
    private Price price;
    private int weightInGrams;

    public Product(String name, Price price, int weightInGrams) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }

    public String getPriceWithCurrency() {
        return this.price.getValue() + this.price.getCurrencyCode();
    }

    public double getPrice() {
        return this.price.getValue();
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setPriceBelowCompetition() {
        this.price = CompetitorBasedPricer.getPriceFor(this.name, this.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weightInGrams == product.weightInGrams && Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weightInGrams);
    }
}
