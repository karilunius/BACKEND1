public class Diputado extends Manejador{


    @Override
    protected void procesarDocumento(Documento documento) {
        if (documento.getTipo() == Tipo.Reservado) {
            System.out.println("Puedo manejar este , soy el diputado");
        }
        else if (getSiguienteManejador()!=null) {
            getSiguienteManejador().procesarDocumento(documento);
        }
    }
}
