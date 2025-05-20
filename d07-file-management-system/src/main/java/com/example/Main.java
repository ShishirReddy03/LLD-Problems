package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Terminal terminal = new Terminal();

        terminal.mkdir("Folder-1");
        terminal.cd("Folder-1");
        terminal.mkdir("Folder-2");
        terminal.touch("File-1");
        terminal.rootBack();
        terminal.cd("Folder-1/Folder-2");
        terminal.touch("File-2");
        terminal.ls();
        terminal.rootBack();
        terminal.ls();
    }
    /*
        File Management System - 
        Item --> Folder, File
        Root Directory
        CRUD Operations.
    */
}