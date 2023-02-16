package ch.yannickhohler.depa.decorator.example.decorators;

import ch.yannickhohler.depa.decorator.example.Beverage;

public abstract class Decorator extends Beverage {
    private final Beverage inner;
    public Decorator(Beverage beverage) {
        super(beverage.getSize());
        description = "Decorator";
        price = 0.0;
        this.inner = beverage;
    }
    @Override public double cost() {
        return inner.cost() + price;
    }
    @Override public String getDescription() {
        return inner.getDescription() + description;
    }
}
