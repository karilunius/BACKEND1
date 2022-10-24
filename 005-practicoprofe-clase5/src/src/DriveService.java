import java.util.List;

public class DriveService implements IDrive{

    private List<Documento> documentos;



    //constructor
    public DriveService(List<Documento> documentos) {
        this.documentos = documentos;
    }



    @Override
    public Documento traerDocumento(String url, String mail) {
        return documentos.stream().filter(documento -> documento.getUrl().equals(url) && documento.getUsuariosAutorizados().contains(mail)).findFirst().orElse(null);

    }
}
