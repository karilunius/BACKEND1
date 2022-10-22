import java.util.List;

public class ProxyDriveService implements IDrive{

    private DriveService driveService;
    private Documento documento;

    List<String> usuariosAutorizados;

    //constructor
    public ProxyDriveService(DriveService driveService, Documento documento) {
        this.driveService = driveService;
        this.documento = documento;
    }

    //getters and setters
    public DriveService getDriveService() {
        return driveService;
    }

    public void setDriveService(DriveService driveService) {
        this.driveService = driveService;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }



    @Override
    public void traerDocumento(String url, String mail) {
        if (documento.getUsuariosAutorizados().contains(mail)) {
            Documento documento =  ;
            System.out.println("Puedes acceder al documento.");
        }
    }





}
