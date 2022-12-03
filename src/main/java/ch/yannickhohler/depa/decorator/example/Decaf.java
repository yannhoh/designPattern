package ch.yannickhohler.depa.decorator.example;

public class Decaf extends Beverage {


    public Decaf(Size size) {
        super(size);
        description = "Decaf";
        if(size == Size.Small) price = 1.99;
        if(size == Size.Medium) price = 2.99;
        if(size == Size.Large) price = 3.99;
    }

}
