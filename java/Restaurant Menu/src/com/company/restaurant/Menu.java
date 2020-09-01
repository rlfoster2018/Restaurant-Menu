package com.company.restaurant;

import java.util.ArrayList;

public class Menu extends ArrayList<MenuItem>{

    public ArrayList<MenuItem> Menu() {
        ArrayList menuList = new ArrayList();
        return menuList;
    }

    public void addItem(Menu list, MenuItem item) {
        list.add(item);
    }

    public void removeItemByIndex(Integer index) {
        this.remove(index);

        for (int i = 0; i < this.size(); i++) {
            printItem(this.get(i));
        }
    }

    public void printItem(MenuItem item) {
        System.out.println("");
        System.out.println("*****");
        System.out.println("Name: " + item.courseName);
        System.out.println("Cost: " + item.cost);
        System.out.println(item.description);
        System.out.println("*****");
    }

}

