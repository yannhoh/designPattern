package ch.yannickhohler.depa.iterator_composite.example_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pfannkuchenfrühstück", "Pfannkuchen mit Rührei und Toast", true, 2.99);
        addItem("Einfaches Pfannkuchenfrühstück", "Pfannkuchen mit Spiegelei und Wurst", false, 2.99);
        addItem("Blaubeerpfannkuchen", "Pfannkuchen mit frischen Blaubeeren und Blaubeersirup", true, 3.49);
        addItem("Waffeln", "Waffeln mit Blaubeeren oder Erdbeeren", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public List<MenuItem> getMenuItems() { //Brauchts nicht mehr, nachdem Iterator angeboten wird.
//        return menuItems;
//    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
