package edu.elsmancs.ricksybusiness.domain;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{
    private double fee = 500;
    private Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {

    }

    /**
     * getter que te devuelve la flota.
     * @return
     */

    Map getFlota() {
        return this.flota = flota;
    }

    /**
     * setter, este metodo necesita que le pases
     * @param ovni
     */

    void add(String ovni) {
        flota.put(ovni, null);
    }

    /**
     * Metodo de la interfaz de GuestDispatcher,
     * este metodo necesita de una tarjeta de credito,
     * recorre el hashmap de flota buscando las entradas,
     * comprueba que si el ovni es null y tiene mas dinero de lo que cuesta que lo meta,
     * el break es para cortar el proceso y no meta keys duplicadas.
     *
     * Este metodo queda refactorizarlo.
     * @param creditCard
     */

    @Override
    public void dispatch(CreditCard creditCard) {
        for (Map.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == null && creditCard.credit() >= fee) {
                creditCard.pay(fee);
                flota.put(ovni.getKey(), creditCard.number());
                break;
            }
        }
    }

    /**
     * Este metodo requiere de un owner,
     * recorre el mapa y busca un ovni con owner y cuando lo encuentra devuelve el nombre del ovni.
     * @param owner
     * @return
     */

    String getUfoOf(String owner) {
        String ovniName = "";

        for (Map.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == owner) {
                ovniName = ovni.getKey();
            }
        }
        return ovniName;
    }

    /**
     * Metodo toString
     * @return
     */

    @Override
    public String toString() {
        return flota.keySet().toString();
    }
}
