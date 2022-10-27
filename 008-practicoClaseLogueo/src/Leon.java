import org.apache.log4j.Logger;

public class Leon {
    private String nombre;
    private int edad;
    private Boolean esAlfa;

    private static final Logger logger = Logger.getLogger(Leon.class);


    public Leon(String nombre, int edad, Boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(Boolean esAlfa) {
        this.esAlfa = esAlfa;
    }

    public void correr() {
        logger.info("El león " + nombre + " está corriendo");
    }

    public void esMayorA10() throws Exception {
        if(edad > 10 && esAlfa) {
            logger.info("El leon " + nombre + " es mayor a 10 y es alfa");
        }

        if(edad < 0) {
            logger.error("La edad no puede ser menor a 0");
            throw new Exception("La edad no puede ser menor a 0");
        }
    }
}
