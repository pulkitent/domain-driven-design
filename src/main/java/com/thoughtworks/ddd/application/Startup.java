package com.thoughtworks.ddd.application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Price;
import com.thoughtworks.ddd.domain.Product;

import java.util.Currency;

public class Startup {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Price price = new Price(10, Currency.getInstance("INR"));
        Product cricketBat = new Product("GM Circket Bat", price);

        cricketBat.getPrice();

        Item batItem = new Item(cricketBat, 2);
        cart.add(batItem);
//        cart.remove(batItem);

        Cart anotherCart = new Cart();

        Price anotherPrice = new Price(10, Currency.getInstance("INR"));
        Product anotherCricketBat = new Product("GM Circket Bat", anotherPrice);

        anotherCricketBat.getPrice();

        Item anotherBatItem = new Item(cricketBat, 2);
        anotherCart.add(anotherBatItem);
//        anotherCart.remove(anotherBatItem);

        boolean isEqual = cart.equals(anotherCart);
    }
}
