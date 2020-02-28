package edu.elsmancs.ricksybusiness.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class UfosParkTest {

    @Test
    public void addUfo() {
        UfosPark ufosPark = new UfosPark();
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");

        ufosPark.add("unx");
        ufosPark.add("dox");
        System.out.println(ufosPark.getFlota());

        String[] expectedOutput = {"dox", "unx"};
        String[] methodOutput = {"dox", "unx"};

        assertArrayEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testDispatch() {
        UfosPark ufosPark = new UfosPark();
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");

        ufosPark.add("unx");
        ufosPark.add("dox");

        ufosPark.dispatch(creditCard);
        ufosPark.getUfoOf(creditCard.number());

        assertEquals("dox", ufosPark.getUfoOf(creditCard.number()));
        System.out.println(ufosPark.getUfoOf(creditCard.number()));
        System.out.println(ufosPark.getFlota());
    }

    @Test
    public void testGetUfoOf() {
        /*
        * Logica similar al test anterior, queda intentar añadir un test
         */
    }
}
