package com.eldermoraes.coffeeshop;

import com.eldermoraes.coffee.CoffeeBuilder;

public class CoffeeShop{

    public Coffee order(){
        return CoffeeBuilder.getInstance(CoffeeBuilder.CoffeeType.ESPRESSO, true);
    }
}
