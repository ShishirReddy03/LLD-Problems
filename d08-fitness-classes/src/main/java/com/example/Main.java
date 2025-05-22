package com.example;

import com.example.FitnessClasses.DanceClass;
import com.example.FitnessClasses.FitnessClass;
import com.example.FitnessClasses.GymClass;
import com.example.FitnessClasses.YogaClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FitnessCenter cultFit = new FitnessCenter();
        
        FitnessClass yogaClass = new YogaClass(2);
        FitnessClass danceClass = new DanceClass(3);
        FitnessClass gymClass = new GymClass(5);

        Admin.addClass(cultFit, yogaClass);
        Admin.addClass(cultFit, danceClass);
        Admin.addClass(cultFit, gymClass);

        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        User user4 = new User("User4");

        cultFit.registerUser(user1, UserTier.SILVER);
        cultFit.registerUser(user2, UserTier.SILVER);
        cultFit.registerUser(user3, UserTier.SILVER);
        cultFit.registerUser(user4, UserTier.SILVER);

        user1.enroll(cultFit, yogaClass);
        user2.enroll(cultFit, yogaClass);
        user3.enroll(cultFit, yogaClass);
        user4.enroll(cultFit, yogaClass);
        user1.unenroll(cultFit, yogaClass);
        user2.unenroll(cultFit, yogaClass);
    }
    /*
        User: Name, Tier(Platinum, Gold, Silver)
            register(), login(), 
        Admin: createClass(), scheduleClass(), cancelClass()
        FitnessClass --> YogaClass, DanceClass, GymClass
        capacity, List<User>users;
        
        App --> List<User>registeredUsers, bookClass, cancelClass,

    */
}