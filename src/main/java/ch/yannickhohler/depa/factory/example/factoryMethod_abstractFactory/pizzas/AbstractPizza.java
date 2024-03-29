package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Cheese;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Clams;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Dough;
import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.ingredients.Sauce;

public abstract class AbstractPizza {
    String name;
    Cheese cheese;
    Dough dough;
    Sauce sauce;
    Clams clams;

    public abstract void prepare();
    public void bake() {
        System.out.println("Backe für 25 Minuten bei 350 Grad");
    }
    public void cut() {
        System.out.println("Schneide Pizza diagonal in Stücke");
    }
    public void box() {
        System.out.println("Lege Pizza in offiziellen PizzaStore-Karton");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
