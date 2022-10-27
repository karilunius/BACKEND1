package com.company;

import org.apache.log4j.Logger;

public class Leon {

    private static final Logger logger = Logger.getLogger(Leon.class);
    private String nombre;
    private int edad;
    private Boolean esAlfa;

    public Leon() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(Boolean esAlfa) {
        this.esAlfa = esAlfa;
    }
    public void corre(){
        logger.info("El leon " + nombre + " esta corriendo");
    }
    public void esMayora10() throws Exception{
        if (edad > 10 && esAlfa) {
            logger.info("el leon " +nombre +" es mayor a 10");

        }

        if (edad< 1) {
            logger.error("error");
            throw new Exception("La edad no puede ser menor a 0");




        }


    }
}
