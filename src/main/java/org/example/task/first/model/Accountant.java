package org.example.task.first.model;

import org.example.task.first.model.employee.AbstractEmployee;

public class Accountant implements MoneyCalculable {

    @Override
    public Money calculatePay(AbstractEmployee e) {
        return e.calculatePay();
    }

    @Override
    public Money calculateBonus(AbstractEmployee e) {
        return e.calculateBonus();
    }

}
