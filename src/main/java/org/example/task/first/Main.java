package org.example.task.first;

import org.example.task.first.model.Accountant;
import org.example.task.first.model.employee.AbstractEmployee;
import org.example.task.first.model.employee.CommissionedEmployee;
import org.example.task.first.model.employee.HourlyEmployee;
import org.example.task.first.model.employee.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();

        AbstractEmployee johnWeak = new SalariedEmployee("John Weak");
        System.out.println(accountant.calculatePay(johnWeak));
        System.out.println(accountant.calculateBonus(johnWeak));

        AbstractEmployee chuckNoris = new HourlyEmployee("Chuck Noris", 10);
        System.out.println(accountant.calculatePay(chuckNoris));
        System.out.println(accountant.calculateBonus(chuckNoris));

        AbstractEmployee jackieChan = new CommissionedEmployee("Jackie Chan");
        System.out.println(accountant.calculatePay(jackieChan));
        System.out.println(accountant.calculateBonus(jackieChan));

        AbstractEmployee stevenSeagal = new HourlyEmployee("Steven Seagal", 2);
        System.out.println(accountant.calculatePay(stevenSeagal));
        System.out.println(accountant.calculateBonus(stevenSeagal));
    }
}
