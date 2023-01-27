package ch.yannickhohler.depa.template_method.example;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
     boilWater();
     brew();
     pourInCup();
     addCondiments();
    }

    // Final damit sie nicht überschrieben werden können von den Subklassen
    public final void boilWater() { System.out.println("Koche Wasser"); }

    public abstract void brew();
    public abstract void addCondiments();

    public final void pourInCup() { System.out.println("Gieße das Getränk in die Tasse"); }

    //Wir können auch konkrete Methoden verwenden, die standardmäßig nichts tun. Diese nennen wir »Hooks«.
    //Sie können von Subklassen überschrieben werden (müssen aber nicht)
    void hook() {}

}
