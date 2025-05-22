package com.example.FitnessClasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.example.User;

public abstract class FitnessClass {
    private String className;
    private int capacity;
    private List<User>users;
    private Queue<User>waitlist;
    public FitnessClass(String className, int capacity) {
        this.className = className;
        this.capacity = capacity;
        users = new ArrayList<>();
        waitlist = new LinkedList<>();
    }

    public String getClassName() {
        return className;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<User> getUsers() {
        return users;
    }

    public void enrollUser(User user) {
        if(users.size()<capacity) {
            users.add(user);
            System.out.println(user.getName() + " registered for " + className);
        }
        else {
            waitlist.add(user);
            System.out.println(user.getName() + " is added to waitlist for " + className);
        }
    }
    
    public void unenrollUser(User user) {
        users.remove(user);
        System.out.println(user.getName() + " is de-registered from " + className);

        if(waitlist.size() >= 1) {
            User waitUser = waitlist.poll();
            users.add(waitUser);
            System.out.println(waitUser.getName() + " is registered for " + className);
        }
    }
}
