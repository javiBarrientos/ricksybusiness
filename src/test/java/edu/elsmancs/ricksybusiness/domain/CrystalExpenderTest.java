package edu.elsmancs.ricksybusiness.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class CrystalExpenderTest {

    @Test
    public void comprobarStock() {
        CrystalExpender crystalExpender = new CrystalExpender(4, 50);

        assertEquals(4, crystalExpender.stock());
    }

    public void comprobarCompra() {
        CrystalExpender crystalExpender = new CrystalExpender(4, 50);
        CreditCard creditCard = new CreditCard("Abradolph Lincler", "4916119711304546");
        crystalExpender.dispatch(creditCard);

        assertEquals(3450, creditCard.pay(50));
        assertEquals(3, crystalExpender.stock());
    }
}