package org.example.task.second.accepter;

public class WalkInCustomerAcceptor implements Acceptable {
    @Override
    public void accept() {
        System.out.println("Walk in customer's order has been accepted");
    }
}
