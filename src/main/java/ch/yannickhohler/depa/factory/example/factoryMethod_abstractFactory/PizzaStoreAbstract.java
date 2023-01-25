package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas.AbstractPizza;

public abstract class PizzaStoreAbstract {

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Factory Method abstract
    // Die gesamte Verantwortung für die Instanziierung von Pizzas wurde in
    // eine Methode verschoben, die sich wie eine Factory verhält. (Fabrikmethode)
    // Man wählt die Art von Pizza, indem man sich entscheidet in welchen Store man geht.
    abstract AbstractPizza createPizza(String type);

}
