package com.company.restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {

        Menu MasterMenu = new Menu();

        // Master Menu contains every single menu item, past or present
        // As I'm hungry for Italian food, and we're still working on the project,
        // I'm content with a two dish restaurant... with a drink

        MasterMenu.addItem(MasterMenu, new MenuItem("Chicken Alfredo", 12.00));
        MasterMenu.addItem(MasterMenu, new MenuItem("Chicken Parmesan", 12.00));
        MasterMenu.addItem(MasterMenu, new MenuItem("Soda", 1.00));

        for (int i = 0; i < MasterMenu.size(); i++) {
            MasterMenu.printItem(MasterMenu.get(i));
        }

        MasterMenu.removeItemByIndex(1);
    }
}
