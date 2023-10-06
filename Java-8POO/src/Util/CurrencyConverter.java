package Util;

public class CurrencyConverter {
    private static final double IOF = 0.06;

    public static double converter(float price, float amount){
        return price*amount*(1+IOF);
    }
}
