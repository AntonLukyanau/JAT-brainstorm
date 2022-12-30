package org.example.task.second;

import org.example.task.second.accepter.TelephoneOrderAcceptor;
import org.example.task.second.payer.InPersonPayService;

public class Application {
    public static void main(String[] args) {
        RestaurantService rs = new RestaurantService(new TelephoneOrderAcceptor(), new InPersonPayService());
        rs.accept();
        rs.pay();
    }
}
