import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        File log4jfile = new File("C:\\Users\\Karol\\Desktop\\BACKEND1\\008-mesa8Actividad2Logueo\\log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        List<Integer> miLista = List.of(3, 1, 4, 1,1,1,1,1,1,1,1,1);
        List<Integer> listaVacia = List.of();
        Lista lista = new Lista(miLista);
        Lista lista2 = new Lista(listaVacia);
        lista.validarLista();
        lista2.validarLista();

    }
}