package edu.elsmancs.ricksybusiness.domain;

public class CreditCard {
    private String owner = "";
    private String number = "";
    private double credit = 3000;
    private String symbol = "EZI";

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    String number() {
        return this.number = number;
    }

    double credit() {
        return this.credit = credit;
    }

    boolean pay(double pago) {
        if (this.credit >= pago) {
            this.credit -= pago;
            return true;
        } else {
            System.out.println("No tienes pasta macho");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Owner = " + owner + "\n" +
                "Number = " + number + "\n" + "Credit = " + credit + symbol;
    }
}