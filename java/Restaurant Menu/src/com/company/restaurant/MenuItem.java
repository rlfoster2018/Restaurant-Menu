package com.company.restaurant;

import java.util.HashMap;

public class MenuItem {

    public String courseName;
    public Double cost;
    public String description;
    private Boolean isOld;
    private Integer isAdded;

    public MenuItem(String courseName, Double cost, String description, String date, Boolean isOld, Integer isAdded) {
        this.courseName = courseName;
        this.cost = cost;
        this.description = description;
        this.isOld = false;
        this.isAdded = 0;
    }

    public MenuItem(String courseName) {
        this.courseName = courseName;
        this.cost = 3.50;
        this.description = "About that time I saw the menu item was a 90 foot tall dinosaur from the Cretaceous period.";
    }

    public MenuItem(String courseName, Double cost) {
        this.courseName = courseName;
        this.cost = cost;
        this.description = "It's food, what do you want?";
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aName) {
        courseName = aName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double aCost) {
        cost = aCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String yoMama) {
        description = yoMama;
    }

}
