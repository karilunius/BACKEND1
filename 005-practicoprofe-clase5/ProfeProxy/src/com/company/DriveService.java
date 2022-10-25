package com.company;

import java.util.List;

public class DriveService implements IDrive{

    private List<Documento> documentos;

    public DriveService(List<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public Documento traerDocumento(String url, String mail) {
        System.out.println("El suaurio" + mail + "accede a documento" + url);
        return documentos.stream().filter(documento -> documento.getUrl().equals(url) && documento.getUsuariosAutorizados().contains(mail)).findFirst().orElse(null);
    }
}

