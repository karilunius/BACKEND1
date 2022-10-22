public abstract class Manejador {

    private Manejador siguienteManejador;


    protected abstract void procesarDocumento(Documento documento);


    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }
}
