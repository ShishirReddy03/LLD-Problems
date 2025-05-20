package com.example;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private double totalSplit;
    private Map<User, Double> splits;

    public User(String name) {
        this.name = name;
        totalSplit = 0;
        splits = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public double getTotalSplit() {
        return totalSplit;
    }

    public Map<User, Double> getSplits() {
        return splits;
    }

    public void addSplit(User user, double amount) {
        splits.put(user, amount + splits.getOrDefault(user, 0.0));
        totalSplit += amount;
    }

    public void settleUp(User user) {
        totalSplit -= splits.getOrDefault(user, 0.0);
        splits.put(user, 0.0);
    }
}
