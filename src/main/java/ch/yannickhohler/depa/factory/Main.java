package ch.yannickhohler.depa.factory;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.PizzaStoreAbstract;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.PizzaStoreChicago;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.PizzaStoreNewYork;
import ch.yannickhohler.depa.factory.example.simpleFactory.SimplePizzaFactory;
import ch.yannickhohler.depa.factory.example.simpleFactory.SimplePizzaStore;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(simplePizzaFactory);
        System.out.println("SimpleStore: " + simplePizzaStore.orderPizza("cheese"));

        //With abstract Pizzastore as Framework
        PizzaStoreAbstract pizzaStoreChicago = new PizzaStoreChicago();
        System.out.println("Chicago: " + pizzaStoreChicago.orderPizza("clam"));
        PizzaStoreAbstract pizzaStoreNY = new PizzaStoreNewYork();
        System.out.println("New York: " + pizzaStoreNY.orderPizza("clam"));
    }
}
