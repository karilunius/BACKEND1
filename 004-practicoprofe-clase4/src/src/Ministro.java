public class Ministro extends Manejador{


    @Override
    protected void procesarDocumento(Documento documento) {
        if (documento.getTipo() == Tipo.Secreto) {
            System.out.println("Puedo procesar este documento, soy el Ministro.");
        }
        else if (getSiguienteManejador()!=null) {
                getSiguienteManejador().procesarDocumento(documento);
        }
    }
}
