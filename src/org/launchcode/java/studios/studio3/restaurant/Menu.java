package org.launchcode.java.studios.studio3.restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //The app should know when the menu was last updated,
    // so visitors can see that the restaurant is constantly changing and adding exciting new items
    private Date lastUpdated;
    //The menu consists of several menu items
    private ArrayList<MenuItem> menuItemList = new ArrayList<>();

    public Menu(Date d,ArrayList<MenuItem>mIL){
        this.lastUpdated =d;
        this.menuItemList = mIL;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
    // A way to add menu items from the menu.
    public ArrayList<MenuItem> addItem(MenuItem item){
        this.menuItemList.add(item);
        return this.menuItemList;
    }

    // A way to remove menu items from the menu.
    public ArrayList<MenuItem> removeItem(MenuItem item){
        int itemToRemove = -1;
        for(int index =0; index<menuItemList.size(); index++){
            if(menuItemList.get(index).equals(item)){
                itemToRemove=index;
            }
        }
        this.menuItemList.remove(itemToRemove);
        return this.menuItemList;
    }
    // A way to tell when the menu was last updated.
    public String menuLastUpdated(Date lastUpdated){
        return ("Last updated on " + this.lastUpdated);
    }

    // A way to print out the entire menu.
    public void printMenu(){
        for (int index = 0; index <menuItemList.size() ; index++) {
            //get description at index
            System.out.println(menuItemList.get(index).toString());
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
}

