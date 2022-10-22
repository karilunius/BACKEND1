package ejemplo1;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Samsung implements MobileShop {
    
    @Override
    public void modelo(){
        System.out.println("Samsung");
    }

    @Override
    public void precio(){
        System.out.println("20000");
    }
}
