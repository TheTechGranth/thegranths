package DesignPatterns.Decorator;

public class Cappuccino extends Beverage {
    public Cappuccino() {
        beverageName = "Cappuccino Coffee";
    }

    @Override
    int getBeveragePrice() {
        return 12;
    }
}
