import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //se crean usuarios
        Usuario usuario1 = new Usuario("andres@hotmail.com");
        Usuario usuario2 = new Usuario("camilaVarela@hotmail.com");

        //se hace lista usuario
        List<Usuario> usuariosAutorizados = new ArrayList<Usuario>();
        usuariosAutorizados.add(usuario1);
        usuariosAutorizados.add(usuario2);

        //se crean los documentos
        Documento documento = new Documento("www.google.com.co","847405","buscador");
        Documento documento1 = new Documento("www.youtube.com.co","848905","videos");

        //se añaden a una lista
        List<Documento> ListaDocumentos = new ArrayList<Documento>();
        ListaDocumentos.add(documento);
        ListaDocumentos.add(documento1);

        System.out.println("SISTEMA DE DOCUMENTOS");

        System.out.println(ListaDocumentos);
        System.out.println(usuariosAutorizados);
        System.out.println(usuariosAutorizados.get(1));

        System.out.println("*****************************+++");
        DriveService driveService = new DriveService();

        driveService.traerDocumento(documento.getUrl(),usuario1.getMail());
        driveService.traerDocumento(String.valueOf(documento.getUrl()), usuario1.getMail());
        //driveService.traerDocumento(ListaDocumentos,usuariosAutorizados);




    }





}