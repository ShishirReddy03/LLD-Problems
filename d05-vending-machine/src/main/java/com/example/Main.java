package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VendingMachine machine = new VendingMachine(10);

        Item munch = new Item("Munch", 10);
        Item lays = new Item("Lays", 20);
        Item silk = new Item("Silk", 50);

        machine.addItemAtIndex(silk, 1);
        machine.addItemAtIndex(silk, 1);
        machine.addItemAtIndex(silk, 1);

        machine.addItemAtIndex(munch, 2);
        machine.addItemAtIndex(munch, 2);
        
        machine.addItemAtIndex(lays, 3);


        machine.fetchItemAtIndex(1);
        machine.fetchItemAtIndex(2);
        machine.fetchItemAtIndex(3);
        machine.fetchItemAtIndex(3);
    }
    /*
        Vending Machine:
        Item -> ItemName, Price, expiryDate.
        VendingMachine -> Map<Integer, Item>Items, Map<Integer, Integer>count
                    showItemsBasedOnIndex(), 
        Payments -> coins, etc
    */
    /*
     To - Do: Multiple quantity dispensing, payments.
     */
}