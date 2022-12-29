package org.example.task.first.model.employee;

import org.example.task.first.model.Money;

public class CommissionedEmployee extends AbstractEmployee {

    public CommissionedEmployee(String name) {
        super(name);
    }

    @Override
    public Money calculatePay() {
        return new Money(0);
    }

    @Override
    public Money calculateBonus() {
        return new Money(1000);
    }
}
