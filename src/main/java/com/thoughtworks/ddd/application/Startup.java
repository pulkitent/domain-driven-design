package com.thoughtworks.ddd.application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Product;

public class Startup {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product ipad = new Product("Ipad");
        cart.add(ipad);

        Product HeroInkPen = new Product("Hero ink Pen");
        cart.add(HeroInkPen);
    }
}
