package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Dough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.FreshClams;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.MarinaraSauce;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Onions;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.ReggianoCheese;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Sauce;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.SlicedPepperoni;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Spinach;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.ThinCrustDough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override public ReggianoCheese createCheese() {
        return new ReggianoCheese();
    }

    @Override public Veggies[] createVeggies() {
        return new Veggies[] { new Spinach(), new Onions() };
    }

    @Override public SlicedPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override public FreshClams createClam() {
        return new FreshClams();
    }
}
