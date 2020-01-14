package com.eldermoraes.coffeeshop;

import com.eldermoraes.coffee.CoffeeBuilder;

public class CoffeeShop{

    public static void main(String args[]){
        System.out.println(new CoffeeShop().order());
    }

    public Coffee order(){
        return new CoffeeBuilder().getInstance(CoffeeBuilder.CoffeeType.ESPRESSO, true);
    }
}
