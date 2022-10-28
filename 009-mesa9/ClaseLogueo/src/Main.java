import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import java.io.File;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        File log4jfile = new File("/Users/benjabarreiro/Documents/IdeaProjects/ClaseLogueo/log4j.properties.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        Leon leon = new Leon("Simba", -9, true);

        leon.correr();
        try {
            leon.esMayorA10();
        } catch(Exception e) {
            logger.error("La edad no puede ser menor a 0", e);
        }


        Tigre tigre = new Tigre("Simba", -9, true);

        tigre.correr();
        try {
            tigre.esMayorA10();
        } catch(Exception e) {
            logger.error("La edad no puede ser menor a 0", e);
        } finally {
            System.out.println("Hola");
        }
    }
}