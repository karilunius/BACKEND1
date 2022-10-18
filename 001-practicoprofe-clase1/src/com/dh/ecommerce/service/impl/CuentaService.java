package com.dh.ecommerce.service.impl;

import com.dh.ecommerce.model.Cuenta;


public class CuentaService {

    public Cuenta getCuenta (String identificadorDeUsuario){
        System.out.println("Obteniendo cuenta ");
        return new Cuenta(identificadorDeUsuario,100000);
    }
}
