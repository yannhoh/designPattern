package ch.yannickhohler.depa.iterator_composite;

import ch.yannickhohler.depa.iterator_composite.example_iterator.DinerMenu;
import ch.yannickhohler.depa.iterator_composite.example_iterator.PancakeHouseMenu;
import ch.yannickhohler.depa.iterator_composite.example_iterator.Waitress;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
