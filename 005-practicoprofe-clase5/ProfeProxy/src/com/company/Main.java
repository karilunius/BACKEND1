package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nueva = new ArrayList<>();
        nueva.add("marce@hotmail.com");
        nueva.add("lola@hotmail.com");



      Documento documento = new Documento("www-www", "hfhffh", "jfjf",nueva);
        Documento documento1 = new Documento("www-www", "jsjsjs", "jfjf",nueva);

        List<Documento> listaDoc = new ArrayList<>();
        listaDoc.add(documento);
        listaDoc.add(documento1);



      DriveService driveService = new DriveService(listaDoc);
      driveService.traerDocumento("www-www","marce@hotmail.com");



    }
}
