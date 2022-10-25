import java.util.ArrayList;
import java.util.List;

public class DriveService implements IDrive{

    protected List<Documento> documentos = new ArrayList<Documento>();
    protected List<Usuario> usuariosAutorizados = new ArrayList<Usuario>();


    //constructor


    public DriveService() {
    }

    public DriveService(List<Documento> documentos, List<Usuario> usuariosAutorizados) {
        this.documentos = documentos;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    @Override
    public Documento traerDocumento(String url, String mail) {
        //Documento documento = traerDocumento(url, mail); salió error StackOverflowError create breakpoint
        if (documentos.contains(url) && usuariosAutorizados.contains(mail) ) {
            System.out.println("El usuario: " + usuariosAutorizados.contains(mail) + '\n' +
                    "está autenticado para descargar ****************************" + '\n'+
                    "**************DESCARGANDO DOCUMENTO**************************" + '\n' +
                    documentos.toString())
                    ;
        }
        return null;
    }
}
