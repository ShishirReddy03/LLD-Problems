package com.example;

import java.util.HashSet;
import java.util.Set;

import com.example.FitnessClasses.FitnessClass;

public class FitnessCenter {
    Set<User> users;
    Set<FitnessClass> classes;

    public FitnessCenter() {
        classes = new HashSet<>();
        users = new HashSet<>();
    }

    public synchronized void registerUser(User user, UserTier tier) {
        user.setTier(tier);
        users.add(user);
    }

    public void addClass(FitnessClass fitnessClass) {
        classes.add(fitnessClass);
    }

    public void removeClass(FitnessClass fitnessClass) {
        classes.remove(fitnessClass);
    }

    public synchronized void bookClass(User user, FitnessClass fitnessClass) {
        if (!users.contains(user)) {
            System.out.println(user.getName() + " is not registered yet");
            return;
        }
        if (!classes.contains(fitnessClass)) {
            System.out.println("The class specified is not avilable");
            return;
        }

        if (user.getTier() == UserTier.PLATINUM && fitnessClass.getUsers().size() == 10 ||
                user.getTier() == UserTier.GOLD && fitnessClass.getUsers().size() == 5 ||
                user.getTier() == UserTier.SILVER && fitnessClass.getUsers().size() == 3) {
            System.out.println("The maximum limit for the number of classes is reached.");
            return;
        }
        fitnessClass.enrollUser(user);
    }

    public synchronized void unbookClass(User user, FitnessClass fitnessClass) {
        if (!users.contains(user)) {
            System.out.println(user.getName() + " is not registered yet");
            return;
        }
        if (!classes.contains(fitnessClass)) {
            System.out.println("The class specified is not avilable");
        }

        fitnessClass.unenrollUser(user);
    }

}
