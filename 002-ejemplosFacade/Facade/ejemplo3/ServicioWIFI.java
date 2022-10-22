package ejemplo3;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class ServicioWIFI implements ServicioMovil{
    @Override
    public void empezar() {
        System.out.println("servicio WIFI activado");
    }

    @Override
    public void cerrar() {
        System.out.println("servicio WIFI desactivado");
    }
}
