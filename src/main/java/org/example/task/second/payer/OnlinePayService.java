package org.example.task.second.payer;

public class OnlinePayService implements Payable {
    @Override
    public void pay() {
        System.out.println("Online paying completed");
    }
}
