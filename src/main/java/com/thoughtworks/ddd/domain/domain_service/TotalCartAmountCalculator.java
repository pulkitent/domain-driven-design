package com.thoughtworks.ddd.domain.domain_service;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;

import java.util.List;

public class TotalCartAmountCalculator {

    public static double calculateAmount(Cart cart) {
        List<Item> items = cart.getItems();

        Double totalOfItems = items.stream()
                .map(item -> item.getQuantity() * item.getPrice())
                .reduce(Double::sum)
                .get();
        Double costWithShippingCharges = items.stream()
                .map(item -> item.getQuantity() * item.getWeight() * 0.01)
                .reduce(Double::sum)
                .get();

        return totalOfItems + costWithShippingCharges;
    }
}
