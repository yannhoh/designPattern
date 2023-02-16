package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.NYPizzaIngredientFactory;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.PizzaIngredientFactory;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.AbstractPizza;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.CheesePizza;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.ClamPizza;

public class PizzaStoreChicago extends PizzaStoreAbstract {
    @Override AbstractPizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        AbstractPizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
