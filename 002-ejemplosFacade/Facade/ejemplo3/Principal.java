package ejemplo3;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Principal {

    public static void main(String[] args) {
        
        FacadeMovil facade = new FacadeMovil();
        System.out.println("\n------- ON --------");
        Movil movil = facade.encendido();

        System.out.println("\n\n------- OFF --------");

        facade.apagado(movil);
    }
}