package com.dh.ecommerce.model;

public class Cuenta {//creamos la clase//
    private String identificadorDeUsuario;
    private Integer saldo;
//creo el constructor//
    public Cuenta(String identificadorDeUsuario, Integer saldo) {
        this.identificadorDeUsuario = identificadorDeUsuario;
        this.saldo = saldo;
    }

    //creo los metodos aceesores//

    public String getIdentificadorDeUsuario() {
        return identificadorDeUsuario;
    }

    public void setIdentificadorDeUsuario(String identificadorDeUsuario) {
        this.identificadorDeUsuario = identificadorDeUsuario;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
