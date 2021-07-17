package DesignPatterns.Decorator;

public class CoffeeHouse {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());
        beverage = new Milk(beverage);
        System.out.println("after decorating with milk");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());
        beverage = new Caramel(beverage);
        beverage = new Caramel(beverage);
        System.out.println("after decorating with double caramel");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());
    }
}
