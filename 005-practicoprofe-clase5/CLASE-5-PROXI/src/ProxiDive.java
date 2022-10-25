public class ProxiDive implements IDrive{

    private DriveService driveService;
    private Documento documento;

    public ProxiDive(DriveService driveService, Documento documento) {
        this.driveService = driveService;
        this.documento = documento;
    }

    @Override
    public void descargarDocumento(String url, String mail) {
        if (!this.documento.getList().contains(mail)){
            this.driveService.descargarDocumento(url, mail);
        }else {
            System.out.println("Descargando documento de la Url" + url);

        }
    }
}
