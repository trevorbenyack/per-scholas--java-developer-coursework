package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

    private HashMap<String, Item> itemCollection;
    final private int ITEMS_PER_TRANSACTION = 1;

    TheSystem() {
        itemCollection = new HashMap<>();
        if(getClass().getSimpleName().equals("AppSystem")) {

            File sampleFile = new File("resources/sample.txt");
            try {
                Scanner input = new Scanner(sampleFile);
                while (input.hasNextLine()) {
                    String[] itemInfo = input.nextLine().split("  ");
                    itemCollection.put(itemInfo[0], new Item(
                            itemInfo[0],
                            itemInfo[1],
                            Double.parseDouble(itemInfo[2]),
                            Integer.parseInt(itemInfo[3])
                    ));
                }
            } catch (FileNotFoundException e) {
                System.out.println("File cannot be found.");
            }
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {

        if(ITEMS_PER_TRANSACTION > item.getAvailableQuantity()) {
            System.out.println("System is unable to add " + item.getItemName() + " to the cart. System only " +
                    "has " + item.getAvailableQuantity() + " " + item.getItemName() + "(s).");
            return false;
        } else {
            return true;
        }
    }
    
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } if (itemCollection.containsKey(item.getItemName()) && checkAvailability(item)) {
            item.setQuantity(item.getQuantity() + 1);
            return true;
        } else if (!itemCollection.containsKey(item.getItemName())) {
            itemCollection.put(item.getItemName(), item);
            return true;
        } else {
            return false;
        }
    }

    public Item remove(String itemName) {
        if(itemCollection.containsKey(itemName)) {
            return itemCollection.remove(itemName);
        } else {
            return null;
        }
    }

    public abstract void display();

    @Override
    public String toString() {

        return "TheSystem{" +
                "itemCollection=" + itemCollection +
                '}';
    }
}
