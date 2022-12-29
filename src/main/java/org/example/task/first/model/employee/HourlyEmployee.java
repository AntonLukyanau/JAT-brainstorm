package org.example.task.first.model.employee;

import org.example.task.first.model.Money;

public class HourlyEmployee extends AbstractEmployee {

    private int rate;

    public HourlyEmployee(String name, int rate) {
        super(name);
        this.rate = rate;
    }

    @Override
    public Money calculatePay() {
        return new Money(11 * rate);
    }

    @Override
    public Money calculateBonus() {
        return new Money(0);
    }
}
