package com.thoughtworks.ddd.domain.domain_service;

import com.thoughtworks.ddd.domain.Price;

import java.util.HashMap;
import java.util.Map;

//Generally stateless
// and created when model/entity can't take the responsibility
public class CompetitorBasedPricer {
    private static final Map<String, Double> competitorProductPriceMap = new HashMap<>();

    static {
        competitorProductPriceMap.put("GM Cricket Bat", 5.0);
    }

    public static Price getPriceFor(String productName, Price productPrice) {
        double competitorPrice = competitorProductPriceMap.get(productName);
        return new Price(competitorPrice * 0.9, productPrice.getCurrency());
    }
}
