package ch.yannickhohler.depa.decorator.example.decorators;

import ch.yannickhohler.depa.decorator.example.Beverage;

public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
        description = " extraMilk";
        if(beverage.getSize() == Size.Small) price = 1.0;
        if(beverage.getSize() == Size.Medium) price = 1.4;
        if(beverage.getSize() == Size.Large) price = 1.6;
    }
}
