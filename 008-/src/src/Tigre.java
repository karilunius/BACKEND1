
public class Tigre extends Animal{

    //USAR ESTA VARIABLE en las clases
    //protected final static Logger logger = Logger.getLogger(Animal.class);

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void correr() {

        System.out.println("El" + getNombre() + "está corriendo");
    }

    @Override
    public void esMayorYAlfa() {
        if (getEdad()>10) {
            System.out.println("El" + getNombre() + " no entra en categoría ALFA, pero tiene más de 10 años");
        }
        else{
            System.out.println("El" + getNombre() + " no entra en categoría ALFA y tiene menos de 10 años");
        }
    }


}

