package ejemplo1;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Iphone implements MobileShop {
    
    @Override
    public void modelo(){
        System.out.println("iphone 6");
    }

    @Override
    public void precio(){
        System.out.println("25000.00");
    }
}

