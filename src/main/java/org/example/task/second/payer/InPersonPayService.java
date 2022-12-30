package org.example.task.second.payer;

public class InPersonPayService implements Payable {
    @Override
    public void pay() {
        System.out.println("In person paying completed");
    }
}
