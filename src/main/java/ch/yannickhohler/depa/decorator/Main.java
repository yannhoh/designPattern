package ch.yannickhohler.depa.decorator;

import ch.yannickhohler.depa.decorator.example.Beverage;
import ch.yannickhohler.depa.decorator.example.Cappuccino;
import ch.yannickhohler.depa.decorator.example.Decaf;
import ch.yannickhohler.depa.decorator.example.decorators.Milk;
import ch.yannickhohler.depa.decorator.example.decorators.Whip;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Cappuccino(Beverage.Size.Large);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println("Cost: " + beverage.cost());

        Beverage beverage2 = new Decaf(Beverage.Size.Small);
        beverage2 = new Whip(new Milk(beverage2));
        System.out.println(beverage2.getDescription());
        System.out.println("Cost: " + beverage2.cost());
    }
}
