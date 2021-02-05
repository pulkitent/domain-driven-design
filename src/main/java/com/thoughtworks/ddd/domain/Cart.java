package com.thoughtworks.ddd.domain;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new LinkedList<>();
    }

    public void add(Item item) {
        this.items.add(item);
    }
}
