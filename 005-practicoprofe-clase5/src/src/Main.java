import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> nueva = new ArrayList<>();
        nueva.add("andres@hotmail.com");
        nueva.add("camilaVarela@hotmail.com");


        Documento documento = new Documento("www.google.com.co","847405","buscador",nueva);
        Documento documento1 = new Documento("www.youtube.com.co","848905","videos",nueva);

        List<Documento> ListaDoc = new ArrayList<>();
        ListaDoc.add(documento);
        ListaDoc.add(documento1);

        DriveService driveService = new DriveService(ListaDoc);

        driveService.traerDocumento("www.google.com","andres@hotmail.com");




    }





}