package ch.yannickhohler.depa.decorator.example;

public class Cappuccino extends Beverage {

    public Cappuccino(Size size) {
        super(size);
        description = "Feinster Cappuccino";
        if(size == Size.Small) price = 3.99;
        if(size == Size.Medium) price = 4.99;
        if(size == Size.Large) price = 5.99;
    }

}
