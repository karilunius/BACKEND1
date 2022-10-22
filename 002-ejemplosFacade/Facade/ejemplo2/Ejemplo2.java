package ejemplo2;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Ejemplo2 {
   
    public static void main(String[] args) {
        
        //Instanciación de interfaces a partir de sus clases que las implementarán
        IAcelerador acelerador = new Acelerador();
        IEmbrague embrague = new Embrague();
        IPalancaCambios palancaCambios = new PalancaCambios();

        //Creación de la fachada
        Fachada fachada = new Fachada(embrague, acelerador, palancaCambios);
        
        
        //Utilización de la fachada a través del método principal
        System.out.println("\n\n-------- ACELERANDO --------\n");
        fachada.aumentarMarcha();
        
        System.out.println("\n\n-------- ACELERANDO --------\n");
        fachada.aumentarMarcha();
        
        
        System.out.println("\n\n-------- ACELERANDO --------\n");
        fachada.aumentarMarcha();
        
        
        System.out.println("\n\n-------- DESACELERANDO --------\n");
        fachada.reducirMarcha();
        
        System.out.println("");
        
        
        
        acelerador .soltarAcelerador();
        
        
    }
    
}
