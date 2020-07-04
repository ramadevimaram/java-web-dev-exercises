package org.launchcode.java.studios.studio3.restaurant;
import org.launchcode.java.studios.studio3.restaurant.MenuItem;
import org.launchcode.java.studios.studio3.restaurant.Menu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        // write your code here
        MenuItem spaghetti = new MenuItem("pasta",14.99,"Tomato and noodles","Entree",true);
        MenuItem burger = new MenuItem("Burger",12.99,"bread and meat","Entree",true);
        MenuItem tacos = new MenuItem("taco",10.99,"All you can Eat","starter",false);

        //get today's date
        Date currentDate = Calendar.getInstance().getTime();
        ArrayList<MenuItem> firstMenu = new ArrayList<>();

        Menu theMenu = new Menu(currentDate, firstMenu);
        //add items to menu
        theMenu.addItem(spaghetti);
        theMenu.addItem(burger);
        theMenu.addItem(tacos);

        theMenu.printMenu();
        //try removing items
        theMenu.removeItem(tacos);
        theMenu.printMenu();
        theMenu.printItem(spaghetti);
        theMenu.menuLastUpdated(currentDate);

    }
}