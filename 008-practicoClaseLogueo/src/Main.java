import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import java.io.File;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        File log4jfile = new File("C:\\Users\\Karol\\Desktop\\BACKEND1\\008-practicoClaseLogueo\\log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Leon leon = new Leon("Simba", -9, true);
        Leon leon1 = new Leon("Simba", 9, true);
        leon.correr();
        leon.esMayorA10();

        Tigre tigre = new Tigre("Simba", -9, true);

        tigre.correr();
        tigre.esMayorA10();

        try {
            leon1.esMayorA10();
            tigre.esMayorA10();
        } catch (Exception e) {
            logger.error("Edad no debe ser 0", e);
        } finally {
            System.out.println("Terminado del codigo");
        }


    }

}