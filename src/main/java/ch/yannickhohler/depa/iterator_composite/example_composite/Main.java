package ch.yannickhohler.depa.iterator_composite.example_composite;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu  = new Menu("PFANNKUCHENHAUS-SPEISEKARTE", "Frühstück");
        MenuComponent dinerMenu         = new Menu("RESTAURANT-SPEISEKARTE", "Mittagstisch");
        MenuComponent cafeMenu          = new Menu("CAFÉ-SPEISEKARTE", "Abendessen");
        MenuComponent dessertMenu       = new Menu("DESSERTKARTE", "Natürlich Nachtisch!");
        MenuComponent allMenus          = new Menu("ALLE SPEISEKARTEN", "Alle Speisekarten gemeinsam");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // Gerichte und Speisekarten hinzufügen
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti mit Marinara-Soße und einer Scheibe Sauerteigbrot", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apfelkuchen", "Apfelkuchen mit lockeren Streuseln und Vanilleeis", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
