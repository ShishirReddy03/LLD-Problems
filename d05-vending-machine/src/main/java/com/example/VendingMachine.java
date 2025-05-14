package com.example;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<Integer, Slot> items;

    public VendingMachine(int size) {
        items = new HashMap<>();
        for (int i = 1; i <= size; i++) {
            items.put(i, new Slot());
        }
    }

    public Map<Integer, Slot> getItems() {
        return items;
    }

    public Item fetchItemAtIndex(int index) {
        Slot slot = items.getOrDefault(index, null);
        if (slot == null) {
            System.out.println("The specified serial number is Invalid!");
            return null;
        }
        return slot.fetchItem();
    }
    
    public boolean addItemAtIndex(Item item, int index) {
        Slot slot = items.getOrDefault(index, null);
        if (slot == null) {
            System.out.println("The specified serial number is Invalid!");
            return false;
        }
        slot.addItem(item);
        return true;
    }

}
