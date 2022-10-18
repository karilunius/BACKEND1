package com.dh.ecommerce.service.impl;

import java.util.Random;

public class AutenticationService {

      public Boolean validarUsuarioycontraseña (String usuario, String contraseña) {
        System.out.println("Validando usuario " + usuario);
        Boolean datosValidos =Boolean.FALSE;
        if (usuario != null & contraseña != null)
        datosValidos= validar (usuario, contraseña);
            return datosValidos;



    }
    private Boolean validar( String usuario, String contraseña){
        return new Random().nextBoolean();
    }




}
