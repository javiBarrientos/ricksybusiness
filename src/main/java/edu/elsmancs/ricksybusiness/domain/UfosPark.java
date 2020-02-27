package edu.elsmancs.ricksybusiness.domain;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee = 500;
    private Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {

    }

    Map getFlota() {
        return this.flota = flota;
    }

    void add(String ovni) {
        flota.put(ovni, null);
    }

    /*
    * Recorrer cada ovni con null
    * Comprobar si tiene pasta
    * Asignarle ovni
    * Parar bucle en cuanto ya tenga uno
     */

    void dispatch(CreditCard creditCard) {
        for (Map.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == null && creditCard.credit() >= fee) {
                creditCard.pay(fee);
                flota.put(ovni.getKey(), creditCard.number());
                break;
            }
        }
    }

    String getUfoOf(String owner) {
        String ovniName = "";

        for (Map.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == owner) {
                ovniName = ovni.getKey();
            }
        }
        return ovniName;
    }

    @Override
    public String toString() {
        return flota.keySet().toString();
    }
}
