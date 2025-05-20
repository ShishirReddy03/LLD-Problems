package com.example;

public class FileManager {
    private static Folder root;
    private static FileManager fileManager = null;
    private FileManager() {
        root = new Folder("Root", null);
    }

    public static FileManager getInstance() {
        if(fileManager==null)
            fileManager = new FileManager();
        return fileManager;
    }
    public Folder getRoot() {
        return root;
    }

    public void addFile(String itemName, Folder parent) {
        parent.add(new File(itemName, parent));
    }

    public void addFolder(String itemName, Folder parent) {
        parent.add(new Folder(itemName, parent));
    }

    public void delete(Item item, Folder parent) {
        parent.delete(item);
    }

    public void display() {
        root.display();
    }
}
