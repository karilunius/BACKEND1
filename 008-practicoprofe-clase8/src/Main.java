package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {


        File log4jfile = new File("C:\\Users\\chris\\Desktop\\Digital House\\Log4j.v2\\log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Leon leon = new Leon();
        leon.setNombre("Maxi");
        leon.setEdad(10);
        leon.setEsAlfa(true);
        leon.corre();



    }
}
