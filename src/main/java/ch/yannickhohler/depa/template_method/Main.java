package ch.yannickhohler.depa.template_method;

import ch.yannickhohler.depa.template_method.example.Coffee;
import ch.yannickhohler.depa.template_method.example.Tea;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
