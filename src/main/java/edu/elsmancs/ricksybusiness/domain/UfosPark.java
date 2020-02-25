package edu.elsmancs.ricksybusiness.domain;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee = 500;
    private Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {

    }

    void add(String ovni) {
        flota.put(ovni, null);
    }

    /*
    * Comprobar si tiene pasta
    * Para bucle en cuanto ya tenga uno
    * bug añade la cc por cada null
     */

    void dispatch(CreditCard creditCard) {
        for (Map.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == null) {
                creditCard.pay(fee);
                flota.put(ovni.getKey(), creditCard.number());
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
}
