package edu.elsmancs.ricksybusiness.domain;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * La clase Receptivo la usaremos para registrar y despachar todos los productos en un pack.
 */

class Receptivo {

    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    /**
     * El metodo registra un dispatch en la lista.
     * @param observer
     */

    void registra(GuestDispatcher observer) {
        observers.add(observer);
    }

    /**
     * El metodo dispatch recorre cada uno de los observers guardados en la lista se asignara un usuario.
     * @param card
     */

    void dispatch(CreditCard card) {
        for (GuestDispatcher observer: observers) {
            observer.dispatch(card);
        }
    }
}
