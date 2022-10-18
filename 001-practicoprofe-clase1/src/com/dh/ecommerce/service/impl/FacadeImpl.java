package com.dh.ecommerce.service.impl;

import com.dh.ecommerce.model.Cuenta;

import java.util.Random;

public class FacadeImpl implements IFacadeCajero{

    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public FacadeImpl(AutenticationService autenticationService, CuentaService cuentaService, CajaService cajaService) {
        this.autenticationService = autenticationService;
        this.cuentaService = cuentaService;
        this.cajaService = cajaService;
    }

    @Override
    public Boolean retirarDinero(String identificaciondeCliente, String contrasena, Integer montoaRetirar) {
        Boolean dineroEntregado = Boolean.FALSE;
        if (autenticationService.validarUsuarioycontraseña(identificaciondeCliente,contrasena)) {
            Cuenta cuenta = cuentaService.getCuenta(identificaciondeCliente);
            if (montoaRetirar<= cuenta.getSaldo())
                dineroEntregado= (cajaService.entregarDinero(montoaRetirar)!=null);
        }



        return null;
    }
    private Boolean hayEfectivo(Integer monto){
        return new Random().nextBoolean();
    }
}
