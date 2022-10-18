package com.dh.ecommerce;


import com.dh.ecommerce.service.impl.*;

public class Main {

    public static void main(String[] args) {
        IFacadeCajero facadeCajero = new FacadeImpl(new AutenticationService(), new CuentaService(), new CajaService());

        Boolean dineroentregado = facadeCajero.retirarDinero("Maxi","qwerty",1000);


    }
}
