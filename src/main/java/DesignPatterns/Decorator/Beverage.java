package DesignPatterns.Decorator;

public abstract class Beverage {
    String beverageName = "";

    String getBeverageName(){
        return beverageName;
    }

    abstract int getBeveragePrice();
}
