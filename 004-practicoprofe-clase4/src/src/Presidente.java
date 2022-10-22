public class Presidente extends Manejador{


    @Override
    protected void procesarDocumento(Documento documento) {
        if (documento.getTipo() == Tipo.Muy_secreto) {
            System.out.println("Puedo procesar este documento, soy el Presidente.");
        }
        else if (getSiguienteManejador()!=null) {
            getSiguienteManejador().procesarDocumento(documento);
        }
    }
}
