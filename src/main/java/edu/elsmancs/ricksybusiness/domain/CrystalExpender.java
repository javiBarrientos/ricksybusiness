package edu.elsmancs.ricksybusiness.domain;

/**
 * la clase de CrystalExpender se encarga de llevar el stock y el coste de del objeto.
 */

public class CrystalExpender implements GuestDispatcher{
    private int stock = 0;
    private double itemCost = 0;

    /**
     * Constructor de la clase CrystalExpender,
     * cada vez que llames a la clase te tendras que pasar los parametros de stock e itemcost.
     * @param stock
     * @param itemCost
     */

    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /**
     * Este getter cuando lo invocas te devuelve el stock.
     * @return
     */

    int stock() {
        return this.stock = stock;
    }

    /**
     * Esta funcion necesita una tarjeta de credito,
     * primer if comprueba que hay stock,
     * segundo if comprueba que tiene pasta y al final resta 1 al stock,
     * esta funcion no devuelve nada.
     *
     * Al ser una clase que implementa una interfaz, si queremos usar los metodos de le interfaz los tendremos que
     * sobreescribir.
     * @param creditCard
     */

    @Override
    public void dispatch(CreditCard creditCard) {
        if (stock() > 0) {
            if (creditCard.credit() >= itemCost) {
                creditCard.pay(itemCost);
                this.stock -= 1;
            }
        }
    }

    /**
     * Metodo toString donde mostramos el stock con el coste de cada item.
     * @return
     */

    @Override
    public String toString() {
        return "Stock = " + stock + "\n" + "Coste = " + itemCost;
    }
}