package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {
        super();
    }

    @Override
    public void display() {
        System.out.println("AppSystem Inventory");
        System.out.printf("%-20s%-20s%-10s%-10s%n",
                "Name",
                "Description",
                "Price",
                "Available Quantity");
        for(Item i : getItemCollection().values()) {
            System.out.printf("%-20s%-20s%-10.2f%-10d%n",
                    i.getItemName(),
                    i.getItemDesc(),
                    i.getItemPrice(),
                    i.getAvailableQuantity());
        }
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } else if(getItemCollection().containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the App System");
            return false;
        } else if (!getItemCollection().containsKey(item.getItemName())) {
            getItemCollection().put(item.getItemName(), item);
            return true;
        } else {
            return false;
        }
    }

    public Item reduceAvailableQuantity(String item_name) {
        if (getItemCollection().containsKey(item_name)) {
            Item tempItem = getItemCollection().get(item_name);
            tempItem.setAvailableQuantity(tempItem.getAvailableQuantity() - 1);
            getItemCollection().replace(item_name, tempItem);
            return tempItem;
        } else {
            return null;
        }
    }
}
