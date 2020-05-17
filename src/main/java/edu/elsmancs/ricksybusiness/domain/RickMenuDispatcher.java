package edu.elsmancs.ricksybusiness.domain;

import java.util.ArrayList;
import java.util.List;


public class RickMenuDispatcher implements GuestDispatcher{
    private int stock = 100;
    private double menuCost = 10.0;
    private final List<Double> orders = new ArrayList<>();

    RickMenuDispatcher() {

    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (stock > 0 && creditCard.pay(menuCost)) {
            stock -= 1;
            orders.add(creditCard.credit());
        }
    }

    @Override
    public String toString() {
        return "Stock = " + stock + "\n"
                + "Orders = " + orders.toString();
    }
}
