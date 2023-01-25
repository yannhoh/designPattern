package ch.yannickhohler.depa.factory.example.simpleFactory;

import ch.yannickhohler.depa.factory.example.simpleFactory.pizzas.Pizza;

public class SimplePizzaStore {

    private final SimplePizzaFactory simplePizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
