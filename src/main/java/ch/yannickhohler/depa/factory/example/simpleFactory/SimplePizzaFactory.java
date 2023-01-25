package ch.yannickhohler.depa.factory.example.simpleFactory;

import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.CheesePizza;
import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.ClamPizza;
import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.PepperoniPizza;
import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.Pizza;
import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
