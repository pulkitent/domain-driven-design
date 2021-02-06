package com.thoughtworks.ddd.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Cart {
    private List<Item> items;
    private List<Item> removedItems;
    private boolean isCheckout;

    public Cart() {
        this.items = new LinkedList<>();
        this.removedItems = new LinkedList<>();
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public void remove(Item item) {
        this.items.remove(item);
        this.removedItems.add(item);
    }

    public Order checkout(Address address) {
        this.isCheckout = true;

        List<Product> products = new LinkedList<>();
        for (Item item : items) {
            int quantity = item.getQuantity();
            for (int index = 0; index < quantity; index++) {
                products.add(item.getProduct());
            }
        }

        //coupled
        return new Order(products, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return items.equals(cart.items) && removedItems.equals(cart.removedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, removedItems);
    }
}
