package edu.elsmancs.ricksybusiness.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UfosParkTest {

    @Test
    public void testAñadirUfo() {
        UfosPark ufosPark = new UfosPark();
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");

        ufosPark.add("trex");
        ufosPark.add("dox");
        System.out.println(ufosPark.getFlota());

        assertEquals("trex", ufosPark.getUfoOf(creditCard.toString()));
    }

    @Test
    public void comprobarUfo() {
        UfosPark ufosPark = new UfosPark();
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");

        assertEquals("dox", ufosPark.getUfoOf(creditCard.toString()));
    }

    @Test
    public void testAñadirValor() {

    }
}
