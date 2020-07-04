package org.launchcode.java.studios.studio3.restaurant;

import java.util.Date;
import java.util.Arrays;
import java.util.Objects;

public class MenuItem {
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String name;
    private String description;
    private String category;
    //It should be possible to display whether a menu item is new or not
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //A Way to tell if a menu item is new
    public String isMenuItemNew() {
        if (this.isNew) {
            return ("NEW");
        } else {
            return ("Not New Menu Item");
        }
    }

    //A Way to print out a single menu item
    public void printItem(MenuItem item) {
        String itemDescription = item.getDescription();
        String itemName = item.getName();
        double itemPrice = item.getPrice();
        boolean isNewItem = item.isNew();
        System.out.println("Item :" + itemName + " " + itemDescription + " " + itemPrice + " " + isNewItem);
    }
    //A Way to determine where or not two menu items are equal

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNew() == menuItem.isNew() &&
                getName().equals(menuItem.getName()) &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getName(), getDescription(), getCategory(), isNew());
    }



}
