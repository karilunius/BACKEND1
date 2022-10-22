package ejemplo2;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

//    Implementación de la interfaz Acelerador

public class PalancaCambios implements IPalancaCambios{
    
    private int velocidadActual=1;  //Aceleración desde la velocidad 1
 
    public void insertarVelocidad(int velocidad){
        System.out.println("Introduciendo marcha " + velocidad);
        this.velocidadActual = velocidad;
    }
 
    public void puntoMuerto(){
        System.out.println("Sacando velocidad " + this.velocidadActual);
    }
 
    public int getVelocidadActual(){
        return velocidadActual;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
