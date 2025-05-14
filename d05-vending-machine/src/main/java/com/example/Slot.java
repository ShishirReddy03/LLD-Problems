package com.example;

import java.util.ArrayList;
import java.util.List;

public class Slot {
    List<Item> items;

    public Slot() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem() {
        return items.get(0);
    }

    public int getQuantity() {
        return items.size();
    }

    public Item fetchItem() {
        if (items.size() == 0) {
            System.out.println("No items available in the slot!");
            return null;
        }
        Item item = items.get(0);
        System.out.println("Please pay: " + item.getPrice() + " for " + item.getItemName());
        items.remove(0);
        return item;
    }

    public String getItemName() {
        return items.get(0).getItemName();
    } 

}
