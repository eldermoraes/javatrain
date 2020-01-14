package coffee.module;

public class Coffee {

    public enum CoffeeType {
        AMERICANO, LATTE, CAPUCCINO, ESPRESSO, FLAT_WHITE, LONG_BLACK, MACHIATO, MOCHACCINO, IRISH, VIENNA, AFFOGATO
    }

    public static String name() {
        return CoffeeType.values()[new Random().nextInt(CoffeeType.values().length)].name();
    }
}