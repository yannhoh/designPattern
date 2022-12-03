package ch.yannickhohler.depa.decorator.example.decorators;

import ch.yannickhohler.depa.decorator.example.Beverage;

public class Whip extends Decorator {

    public Whip(Beverage beverage) {
        super(beverage);
        description = " withWip";
        if(beverage.getSize() == Size.Small) price = 1.1;
        if(beverage.getSize() == Size.Medium) price = 1.3;
        if(beverage.getSize() == Size.Large) price = 1.5;
    }

}
