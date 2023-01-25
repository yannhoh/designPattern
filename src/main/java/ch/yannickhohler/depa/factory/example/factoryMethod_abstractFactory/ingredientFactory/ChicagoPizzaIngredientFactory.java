package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.BlackOlives;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Cheese;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Clams;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Dough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.FrozenClams;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.MozzarellaChesse;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Onions;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Sauce;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.SlicedPepperoni;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.ThickCrustDough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.TomatoSauce;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override public Dough createDough() { return new ThickCrustDough(); }

    @Override public Sauce createSauce() { return new TomatoSauce(); }

    @Override public Cheese createCheese() {
        return new MozzarellaChesse();
    }

    @Override public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new Onions() };
    }

    @Override public SlicedPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override public Clams createClam() {
        return new FrozenClams();
    }
}
