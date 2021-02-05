package com.thoughtworks.ddd.application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Product;

public class Startup {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product cricketBat = new Product("GM Circket Bat");

        cart.add(cricketBat, 2);
    }
}
