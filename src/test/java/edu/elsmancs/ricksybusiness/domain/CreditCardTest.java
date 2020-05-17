package edu.elsmancs.ricksybusiness.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void testTarjetaCredito() {
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");

        assertEquals("4916119711304546", creditCard.number());
        assertEquals(creditCard, creditCard);
        assertEquals(3000, creditCard.credit(), 0);
    }

    @Test
    public void testSinDinero() {
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");
        creditCard.pay(3000);

        assertEquals(0, creditCard.credit(), 0);
    }

    @Test
    public void comprobarPasta() {
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");
        creditCard.pay(2000);

        assertEquals(1000, creditCard.credit(), 0);
    }
}