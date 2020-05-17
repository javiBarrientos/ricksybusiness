package edu.elsmancs.ricksybusiness.domain;

/**
 * La clase de CreditCard se usa para identificar al usuario, su tarjeta de credit y el dinero que tiene.
 *
 * Ademas esta clase se encarga de crear el metodo de pago, que comprueba si puedes hacer pagos devolviendo un
 * boolean.
 */

public class CreditCard {
    private String owner = "";
    private String number = "";
    private double credit = 3000;
    private String symbol = "EZI";

    /**
     * Esto es el constructor de la clase CreditCard,
     * siempre que llames a CreditCard tendras que pasarle como parametros un owner y un number.
     * @param owner
     * @param number
     */

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    /**
     * Haciendo referencia al getter de abajo te devuelve el numero de la CreditCard.
     * @return
     */

    String number() {
        return this.number = number;
    }

    /**
     * Otro getter de esta clase que te devuelve el numero de la tarjeta.
     * @return
     */

    double credit() {
        return this.credit = credit;
    }

    /**
     * Ha este metodo le tienes que pasar un pago y te compara si tu credit es mayor o igual que el pago,
     * si es asi te resta el pago de tu credit y te devuelve true si no es asi no te cobra y devuelve false.
     * @param pago
     * @return
     */

    boolean pay(double pago) {
        if (this.credit >= pago) {
            this.credit -= pago;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Este metodo toString lo usamos para imprimir el owner con su credito.
     * @return
     */

    @Override
    public String toString() {
        return "Owner = " + owner + "\n" +
                "Number = " + number + "\n" + "Credit = " + credit + symbol;
    }
}