package com.example;

public class Terminal {
    private Item currItem;
    private FileManager fileManager;

    public Terminal() {
        fileManager = FileManager.getInstance();
        currItem = fileManager.getRoot();
    }

    public void cd(String path) {
        String []parts = path.split("/");
        boolean flag = false;

        for(int i=0; i<parts.length; i++)
        {
            for (Item item : currItem.getItems()) {
                if (item.getName().equals(parts[i]) && !item.isFile()) {
                    currItem = item;
                    flag = true;
                    break;
                }
                if (!flag) {
                    System.out.println("Invalid directory");
                    return;
                }
            }
        }
        System.out.println("Moving to the directory " + path);

    }
    // public void cd(String itemName) {
    //     boolean flag = false;
    //     for (Item item : currItem.getItems()) {
    //         if (item.getName().equals(itemName) && !item.isFile()) {
    //             currItem = item;
    //             System.out.println("Moving to the directory " + item.getName());
    //             flag = true;
    //             break;
    //         }
    //     }

    //     if (!flag) {
    //         System.out.println("Invalid directory");
    //     }
    // }

    public void ls() {
        currItem.display();
    }

    public void mkdir(String folderName) {
        fileManager.addFolder(folderName, (Folder) currItem);
    }

    public void touch(String fileName) {
        fileManager.addFile(fileName, (Folder) currItem);
    }

    public void rootBack() {
        System.out.println("Rooting back to the parent: " + currItem.getParent().getName());
        currItem = currItem.getParent();
    }

}
