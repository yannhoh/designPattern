package ch.yannickhohler.depa.decorator.example.decorators;

import ch.yannickhohler.depa.decorator.example.Beverage;

public abstract class Decorator extends Beverage {

    private final Beverage beverage;

    public Decorator(Beverage beverage) {
        super(beverage.getSize());
        description = "Decorator";
        price = 0.0;
        this.beverage = beverage;
    }

    @Override public double cost() {
        return beverage.cost() + price;
    }

    @Override public String getDescription() {
        return beverage.getDescription() + description;
    }
}
