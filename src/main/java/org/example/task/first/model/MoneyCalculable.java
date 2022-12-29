package org.example.task.first.model;

import org.example.task.first.model.employee.AbstractEmployee;

public interface MoneyCalculable {

    Money calculatePay(AbstractEmployee e);

    Money calculateBonus(AbstractEmployee e);

}
