package com.thoughtworks.ddd.domain;

public class Item {
    Product product;
    int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
