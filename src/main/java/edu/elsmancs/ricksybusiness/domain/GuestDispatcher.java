package edu.elsmancs.ricksybusiness.domain;

/**
 * Esta clase es una interfaz que usaremos para englobar el metodo dispatch.
 */

interface GuestDispatcher {

    /**
     * Esta es una interfaz que para englobar los metodos con el mismo nombre,
     * para poder usarlo, tienes que poner un implements y el nombre de la interfaz.
     *
     * Para usar el metodo lo tendras que sobreescribir.
     * @param creditCard
     */
    void dispatch(CreditCard creditCard);
}
