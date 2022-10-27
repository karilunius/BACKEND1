package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {


        File log4jfile = new File("C:\\Users\\Karol\\Desktop\\BACKEND1\\009-practicoprofe-clase9\\log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Leon leon = new Leon();
        leon.setNombre("Maxi");
        leon.setEdad(-1);
        leon.setEsAlfa(true);
        leon.corre();

        try {
            leon.esMayora10();
        }catch (Exception e){
            logger.error("La edad: " +leon.getEdad() + " del leon llamado: " + leon.getNombre() + " no puede ser menor a 0",e);
        }

        List<Tigre> tigreList = new ArrayList<Tigre>();
        tigreList.add(new Tigre("Maxi", 15,true));
        tigreList.add(new Tigre("Mani", 16,true));
        tigreList.add(new Tigre("Mimo", 17,true));
        tigreList.add(new Tigre("Mimo", 18,true));


        System.out.println("==================================== size list==============");
        System.out.println(tigreList.size());


        System.out.println("==================================== remove==============");

        System.out.println(tigreList.remove(0));


        System.out.println("==================================== list==============");

        System.out.println(tigreList);


        System.out.println(tigreList.get(0));

        System.out.println();


        System.out.println(tigreList);














    }






}
