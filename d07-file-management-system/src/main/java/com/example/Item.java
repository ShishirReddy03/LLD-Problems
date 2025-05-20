package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private String name;
    private List<Item> items;
    private boolean isFile;
    private Folder parent;

    public Item(String name, Folder parent, boolean isFile) {
        this.name = name;
        this.parent = parent;
        this.isFile = isFile;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void delete(Item item) {
        items.remove(item);
    }

    public boolean isFile() {
        return isFile;
    }

    public String getName() {
        return name;
    }

    public Folder getParent() {
        return parent;
    }

    public List<Item>getItems() {
        return items;
    }

    public void display() {
        for(Item item: items) {
            System.out.println(item.getName());
        }
    }
}
