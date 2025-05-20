package com.example;

import java.util.List;

public class Transaction {
    private double amount;
    private User paidBy;
    private List<User> paidFor;

    public Transaction(double amount, User paidBy, List<User> paidFor) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.paidFor = paidFor;
    }

    public double getAmount() {
        return amount;
    }

    public User paidBy() {
        return paidBy;
    }

    public List<User>paidFor() {
        return paidFor;
    }
}
