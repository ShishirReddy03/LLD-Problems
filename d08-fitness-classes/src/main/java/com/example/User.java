package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.FitnessClasses.FitnessClass;

public class User {
    private String name;
    private UserTier tier;
    List<FitnessClass> classes;

    public User(String name) {
        this.name = name;
        classes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setTier(UserTier tier) {
        this.tier = tier;
    }

    public UserTier getTier() {
        return tier;
    }

    public void enroll(FitnessCenter fitnessCenter, FitnessClass fitnessClass) {
        classes.add(fitnessClass);
        fitnessCenter.bookClass(this, fitnessClass);
    }
    
    public void unenroll(FitnessCenter fitnessCenter, FitnessClass fitnessClass) {
        classes.remove(fitnessClass);
        fitnessCenter.unbookClass(this, fitnessClass);
    }

}
