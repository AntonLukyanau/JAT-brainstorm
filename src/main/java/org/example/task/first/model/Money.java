package org.example.task.first.model;

public class Money {

    private final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + getAmount() +
                '}';
    }
}
