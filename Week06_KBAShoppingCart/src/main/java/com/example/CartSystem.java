package com.example;

public class CartSystem extends TheSystem {
    CartSystem() {
        super();
    }

    @Override
    public void display() {

        Double subTotal = 0.00;
        Double tax = 0.00;
        Double total = 0.00;


        System.out.println("Cart");
        System.out.printf("%-20s%-20s%-10s%-10s%-10s%n",
                "Name",
                "Description",
                "Price",
                "Quantity",
                "Sub Total");
        for(Item i : getItemCollection().values()) {
            Double lineSubTotal = i.getItemPrice() * i.getQuantity();
            subTotal += lineSubTotal;

                    System.out.printf("%-20s%-20s%-10.2f%-10d%-10.2f%n",
                    i.getItemName(),
                    i.getItemDesc(),
                    i.getItemPrice(),
                    i.getQuantity(),
                    lineSubTotal);
        }

        tax = subTotal * 0.05;
        total = subTotal + tax;

        System.out.printf("%-20s%20.2f%n", "Pre-tax Total", subTotal);
        System.out.printf("%-20s%20.2f%n", "Tax", tax);
        System.out.printf("%-20s%20.2f%n", "Total", total);

    }
}
