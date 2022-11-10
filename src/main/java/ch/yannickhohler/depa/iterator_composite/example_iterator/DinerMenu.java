package ch.yannickhohler.depa.iterator_composite.example_iterator;

import ch.yannickhohler.depa.iterator_composite.example_iterator.iterator.ArrayIterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarisches Sandwich ", "(Falscher) Schinken mit Salat und Tomate auf Vollkornbrot", true, 2.99);
        addItem("Schinken-Sandwich", "Schinken mit Salat und Tomate auf Vollkornbrot", false, 2.99);
        addItem("Tagessuppe", "Tagessuppe mit Kartoffelsalat als Beilage", false, 3.29);
        addItem("Hot Dog", "Hot Dog mit Sauerkraut, Soße, Zwiebeln und Käse", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Speisekarte ist voll. Kann keine weiteren Gerichte hinzufügen.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

//    public MenuItem[] getMenuItems() { //Brauchts nicht mehr, nachdem Iterator angeboten wird.
//        return menuItems;
//    }

    public ArrayIterator createIterator() {
        return new ArrayIterator(menuItems);
    }
}
