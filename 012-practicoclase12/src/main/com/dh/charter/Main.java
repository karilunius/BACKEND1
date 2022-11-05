package main.com.dh.charter;

import main.com.dh.charter.dao.impl.AvionDaoH2;
import main.com.dh.charter.model.Avion;
import main.com.dh.charter.service.AvionService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Avion avion = new Avion();

        Avion airbus = new Avion(1,"Airbus","319","abscbasf1243",new Date());

        AvionService avionDeServicio = new AvionService();

        avionDeServicio.setAvionIDao(new AvionDaoH2());
        avionDeServicio.registrarAvion(airbus);
        System.out.println(airbus);

        /*avion.setId(1);
        avion.setMarca("Boeing");
        avion.setModelo("474Airlines");
        avion.setMatricula("489yu");
        avion.setFechaEntradaServicio(new Date(2022));
        */


        //System.out.println(avion);
        //System.out.println(avionDeServicio.hashCode());

        //String mensaje = String.valueOf(avionDeServicio.guardarAvion(avion));
        //System.out.println(mensaje);

        //guardar
       //avionDeServicio.guardarAvion(avion);
        //Me-da null en algo y me arroja una exception, pucha!



    }
}
