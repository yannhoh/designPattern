package ch.yannickhohler.depa.template_method.example;

public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public final void boilWater() {
        System.out.println("Koche Wasser");
    }

    public abstract void brew();

    //Hook
    //Sie können von Subklassen überschrieben werden (müssen aber nicht)
    public boolean customerWantsCondiments() {
        return true;
    }

    public abstract void addCondiments();

    public final void pourInCup() {
        System.out.println("Gieße das Getränk in die Tasse");
    }

}
