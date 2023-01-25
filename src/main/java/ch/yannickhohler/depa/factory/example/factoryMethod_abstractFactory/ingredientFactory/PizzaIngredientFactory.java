package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Cheese;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Clams;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Dough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Sauce;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.SlicedPepperoni;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    SlicedPepperoni createPepperoni();
    Clams createClam();

}
