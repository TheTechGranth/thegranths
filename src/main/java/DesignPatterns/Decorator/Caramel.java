package DesignPatterns.Decorator;

public class Caramel extends IngredientDecorator{
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with Caramel ";
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 5;
    }
}
