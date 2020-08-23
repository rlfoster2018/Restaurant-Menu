package com.company.restaurant;

import java.util.Date;

public class MenuItem {

    public String courseName;
    public Double cost;
    public String description;
    public String date;

    public MenuItem(String courseName, Double cost, String description, String date) {
        this.courseName = courseName;
        this.cost = cost;
        this.description = description;
        this.date = "Date added: " + date;
    }

    public MenuItem(String courseName) {
        this.courseName = courseName;
        this.cost = 3.50;
        this.description = "About that time I saw the menu item was a 90 foot tall dinosaur from the Cretaceous period.";
        this.date = "08/20/100000000 BC";
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
