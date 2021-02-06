package com.thoughtworks.ddd.domain;

import java.util.Objects;

public class Product {
    private String name;
    private Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getPrice() {
        return this.price.getValue() + this.price.getCurrencyCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
