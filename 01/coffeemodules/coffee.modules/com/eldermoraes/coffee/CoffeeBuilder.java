package com.eldermoraes.coffee;

public class CoffeeBuilder {

    public enum CoffeeType {
        AMERICANO, LATTE, CAPUCCINO, ESPRESSO, FLAT_WHITE, LONG_BLACK, MACHIATO, MOCHACCINO, IRISH, VIENNA, AFFOGATO
    }

    public class Coffe {

        private CoffeeType type;
        private boolean isArabica;

        private Coffe(CoffeeType type, boolean isArabica) {
            this.type = type;
            this.isArabica = isArabica;
        }
    }

    public static Coffe getInstance(CoffeeType type, boolean isArabica) {
        Coffe coffe = new Coffe(type, isArabica);
        return coffe;
    }
}