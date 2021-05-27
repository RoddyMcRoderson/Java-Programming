package day32_arrays_split;

import java.sql.SQLOutput;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------FIND THE INDEX OF 'Gloves' in items array -----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("the index of gloves is: " + i);
                break;

            }
        }
        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);
        if (iPadExists) {
            System.out.println("We bought an iPad");
        }
        System.out.println("----Print a report of each shopping item ----");
        /**
         Shoes - $99.99 - #12345
         ....
         iphone 12 case - $39.99 - #12350
         */
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
        System.out.println("----Look for 'Jacket' in items and print all details---");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
    }
}