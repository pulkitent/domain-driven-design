package com.thoughtworks.ddd.domain;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new LinkedList<>();
    }

    public void add(Product product, int quantity) {
        for (int index = 0; index < quantity; index++) {
            this.products.add(product);
        }
    }
}
