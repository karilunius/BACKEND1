package ejemplo1;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Blackberry implements MobileShop {
    
    @Override
    public void modelo(){
        System.out.println("Blackberry");
    }

    @Override
    public void precio(){
        System.out.println("10000.00");
    }
}