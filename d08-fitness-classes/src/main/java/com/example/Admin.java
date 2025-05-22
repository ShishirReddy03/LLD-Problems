package com.example;

import com.example.FitnessClasses.FitnessClass;

public class Admin {
    public static void addClass(FitnessCenter center, FitnessClass fitnessClass) {
        center.addClass(fitnessClass);
    }

    public static void removeClass(FitnessCenter center, FitnessClass fitnessClass) {
        center.removeClass(fitnessClass);
    }
}
