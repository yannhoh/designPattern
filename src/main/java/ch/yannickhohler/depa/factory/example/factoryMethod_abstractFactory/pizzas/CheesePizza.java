package ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.pizzas;

import ch.yannickhohler.depa.factory.example.factoryMethod_abstractFactory.ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends AbstractPizza {

    private final PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override public void prepare() {
        System.out.println("Vorbereitungen für: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
