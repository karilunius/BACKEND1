package ejemplo2;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

//    Implementación de la interfaz Acelerador

public class Acelerador implements IAcelerador {
    public void presionarAcelerador(){
        System.out.println("Acelerador presionado");
    }
 
    public void soltarAcelerador(){
        System.out.println("Acelerador levantado");
    }
}
