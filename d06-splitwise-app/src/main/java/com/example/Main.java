package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        // User user4 = new User("User4");
        // User user5 = new User("User5");

        Splitwise app = Splitwise.getInstance();
        Transaction t1 = new Transaction(1000, user1, List.of(user1, user2));
        Transaction t2 = new Transaction(2000, user2, List.of(user2, user3));
        app.addTransaction(t1);
        app.addTransaction(t2);

        System.out.println(app.getCurrentSplit(user1));
        System.out.println(app.getCurrentSplit(user2));
        System.out.println(app.getCurrentSplit(user3));
        app.getCurrentSplit(user2);
        
        app.settleUp(user1, user2);
        
        System.out.println(app.getCurrentSplit(user1));
        System.out.println(app.getCurrentSplit(user2));
        System.out.println(app.getCurrentSplit(user3));
    }
    /*
        Designing Splitwise - 
        User: name, currentTotalSplit(+ve, -ve), map<User, int>splits, payBack(User, amount);
        Splitwise: List<User>users, getCurrentSplit(User user), 
            addSplit(Transaction t, String description),
            clearSplit(user, user);
        Transaction: int amount, User paidBy, List<User>paidFor

        TO - DO: SplitByAmount, SplitByPercentage
                All Users Splits 
    */
}