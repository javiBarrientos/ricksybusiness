package edu.elsmancs.ricksybusiness.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase RickMenuDispatcher gestiona el stock de menus, su precio y contiene un array con el pago de cada menu.
 *
 * Ademas esta clase implementa la interfaz GuestDispatcher.
 */

public class RickMenuDispatcher implements GuestDispatcher{
    private int stock = 100;
    private double menuCost = 10.0;
    private final List<Double> orders = new ArrayList<>();

    /**
     * Constructor de la clase RickMenuDispatcher vacio por defecto.
     */

    RickMenuDispatcher() {

    }

    /**
     * Este metodo necesita una tarjeta de credito, comprueba si hay stock y si el cliente lo puede pagar,
     * acontinuacion le resta 1 al stock y lo añade al array.
     * @param creditCard
     */

    @Override
    public void dispatch(CreditCard creditCard) {
        if (stock > 0 && creditCard.pay(menuCost)) {
            stock -= 1;
            orders.add(creditCard.credit());
        }
    }

    /**
     * Metodo toString que muestra el stock y los pedidos.
     * @return
     */

    @Override
    public String toString() {
        return "Stock = " + stock + "\n"
                + "Orders = " + orders.toString();
    }
}
