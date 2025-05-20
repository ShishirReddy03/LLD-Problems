package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {
    private static Splitwise splitwise;
    Map<User, Double>userSplits;

    private Splitwise() {
        userSplits = new HashMap<>();
    }

    public static Splitwise getInstance() {
        if(splitwise==null)
            splitwise = new Splitwise();
        return splitwise;
    }
    public void addTransaction(Transaction transaction) {
        User paidByUser = transaction.paidBy();
        List<User>paidForUsers = transaction.paidFor();
        double amount = transaction.getAmount();
        double split = amount/paidForUsers.size();

        for(User user: paidForUsers) {
            paidByUser.addSplit(user, split);
            user.addSplit(paidByUser, -split);
        }
    }

    public double getCurrentSplit(User user) {
        return user.getTotalSplit();
    }

    public Map<User, Double> getAllSplits(User user) {
        return user.getSplits();
    }

    public void settleUp(User user1, User user2) {
        user1.settleUp(user2);
        user2.settleUp(user1);
    }
}
