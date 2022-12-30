package org.example.task.second;

import org.example.task.second.accepter.Acceptable;
import org.example.task.second.payer.Payable;

public class RestaurantService {
    private final Acceptable accepter;
    private final Payable payer;

    public RestaurantService(Acceptable accepter, Payable payer) {
        this.accepter = accepter;
        this.payer = payer;
    }

    public void accept() {
        accepter.accept();
    }

    public void pay() {
        payer.pay();
    }

}
