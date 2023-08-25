package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("samosa", 5.0, "crispy fried snack with potato", "appetizer", false);
        MenuItem menuItem2 = new MenuItem("Ice cream", 2.0, "choco chips flavoured icecream", "dessert", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(menuItem1);
        items.add(menuItem2);
        Date date = new Date(2023, 7, 23);
        Menu menu = new Menu(date, items);
        System.out.println(menu);


    }
}
