package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.NYPizzaIngredientFactory;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.PizzaIngredientFactory;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.AbstractPizza;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.CheesePizza;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.ClamPizza;

public class PizzaStoreNewYork extends PizzaStoreAbstract {

    // Factory Method
    protected AbstractPizza createPizza(String item) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New Yorker Käsepizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New Yorker Pizza mit Muscheln");
        }
        return pizza;
    }
}
