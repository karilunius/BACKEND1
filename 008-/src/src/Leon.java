
public class Leon extends Animal{


    //protected final static Logger logger = Logger.getLogger(Animal.class);
    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        super(nombre, edad);
        this.esAlfa = esAlfa;
    }

    @Override
    public void correr() {
        //logger.info("El" + getNombre() + "está corriendo");
        System.out.println("El" + getNombre() + "está corriendo");
    }

    @Override
    public void esMayorYAlfa(){
        if (esAlfa && getEdad()>10) {
            //logger.info("El" + getNombre() + " es el alfa y tiene más de 10 años");
            System.out.println("El" + getNombre() + "es el alfa y tiene más de 10 años");
        }
        else if(getEdad()<0){
            //logger.error("La edad no puede ser menor a cero.");
            System.out.println("La edad no puede ser menor a 0");
        }
        else{
            System.out.println("El" + getNombre() + "no es Alfa y tiene menos de 10 años");
        }

    }



}
