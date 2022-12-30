package org.example.task.second.accepter;

public class TelephoneOrderAcceptor implements Acceptable {
    @Override
    public void accept() {
        System.out.println("Telephone order has been accepted");
    }
}
