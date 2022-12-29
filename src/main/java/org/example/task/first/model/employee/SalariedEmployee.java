package org.example.task.first.model.employee;

import org.example.task.first.model.Money;

public class SalariedEmployee extends AbstractEmployee {

    public SalariedEmployee(String name) {
        super(name);
    }

    @Override
    public Money calculatePay() {
        return new Money(2000);
    }

    @Override
    public Money calculateBonus() {
        return new Money(500);
    }
}
