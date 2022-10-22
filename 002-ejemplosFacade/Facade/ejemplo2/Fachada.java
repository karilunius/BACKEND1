package ejemplo2;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

public class Fachada {
        
    private IEmbrague embrague;
    private IAcelerador acelerador;
    private IPalancaCambios palancaCambios;
 
    //Método constructor a partir de interfaces    
    public Fachada(IEmbrague embrague, IAcelerador acelerador, IPalancaCambios palancaCambios){
        this.embrague = embrague;
        this.acelerador = acelerador;
        this.palancaCambios = palancaCambios;
    }
    
    /*          Uso de los métodos simulados        */
    public void aumentarMarcha(){
        acelerador.soltarAcelerador();
        embrague.presionarEmbrague();
        palancaCambios.puntoMuerto();
        
        if (palancaCambios.getVelocidadActual() < 5){
            palancaCambios.insertarVelocidad(palancaCambios.getVelocidadActual() + 1);
        }
        acelerador.presionarAcelerador();
        embrague.soltarEmbrague();
        acelerador.soltarAcelerador();
    }
 
    public void reducirMarcha(){
        acelerador.soltarAcelerador();
        embrague.presionarEmbrague();
        palancaCambios.puntoMuerto();
        
        if (palancaCambios.getVelocidadActual() > 0){
            palancaCambios.insertarVelocidad(palancaCambios.getVelocidadActual() - 1);
        }
        acelerador.presionarAcelerador();
        embrague.soltarEmbrague();
        acelerador.soltarAcelerador();
    }
    
}
