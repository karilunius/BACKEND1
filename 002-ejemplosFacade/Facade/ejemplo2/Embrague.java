package ejemplo2;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

//    Implementación de la interfaz Embrague/Clutch

public class Embrague implements IEmbrague{
    
    public void presionarEmbrague(){
        System.out.println("Embrague presionado");
    }
 
    public void soltarEmbrague(){
        System.out.println("Embrague suelto");
    }
    
}
