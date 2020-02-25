package edu.elsmancs.ricksybusiness.domain;

public class CrystalExpender {
    private int stock = 0;
    private double itemCost = 0;

    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /*
    * Comprobar stock
    * Comprobar dinero
     */
    void dispatch(CreditCard creditCard) {
        if (stock() > 0) {
            if (creditCard.credit() >= itemCost) {
                creditCard.pay(itemCost);
                this.stock -= 1;
            }
        }
    }

    int stock() {
        return this.stock = stock;
    }

    @Override
    public String toString() {
        return "Stock = " + stock + "\n" + "Coste = " + itemCost;
    }
}