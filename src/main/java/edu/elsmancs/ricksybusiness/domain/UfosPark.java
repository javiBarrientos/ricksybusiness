package edu.elsmancs.ricksybusiness.domain;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{
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

    @Override
    public void dispatch(CreditCard card) {

        Map.Entry<String, String> ufo = null;

        if (!flota.containsValue(card.number())) {
            for (Map.Entry<String, String> entry : this.flota.entrySet()) {
                if (entry.getValue() == null) {
                    ufo = entry;
                    break;
                }
            }
        }
        if (ufo != null  && card.pay(fee)) {
            this.flota.put(ufo.getKey(), card.number());
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
