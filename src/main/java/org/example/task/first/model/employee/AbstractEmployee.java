package org.example.task.first.model.employee;

import org.example.task.first.model.Money;

public abstract class AbstractEmployee {

    private final String name;

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public abstract Money calculatePay();

    public abstract Money calculateBonus();

}
