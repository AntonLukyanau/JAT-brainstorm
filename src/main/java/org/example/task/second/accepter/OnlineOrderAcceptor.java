package org.example.task.second.accepter;

public class OnlineOrderAcceptor implements Acceptable {
    @Override
    public void accept() {
        System.out.println("Online order has been accepted");
    }
}
