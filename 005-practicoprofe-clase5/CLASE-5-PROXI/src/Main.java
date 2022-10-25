import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listUsuarios = new ArrayList<>();

        listUsuarios.add("maria@gmail.com");
        listUsuarios.add("petra@gmail.com");

        Documento documento1 = new Documento("1498", "www.marta.com", "Esta es la Url de mi prima",listUsuarios);

        IDrive proxi;
        proxi = new ProxiDive(new DriveService(),documento1);
        proxi.descargarDocumento("www.marta.com","maria@gmail.com");
    }
}