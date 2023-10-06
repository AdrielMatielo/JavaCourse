import Util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        make a program that convert U$ in R$,
        this program receives the dollar price and how many dollars will be bought,
        for your return need sum 6%IOF tax
        Need make a class Util.CurrencyConverter for make calculus
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        float price = sc.nextFloat();
        System.out.println("How many dollars will be bought? ");
        float buy = sc.nextFloat();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(price, buy));
    }
}