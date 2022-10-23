public class SpotifyServiceImple implements IntSpotifyService {

    private Usuario usuario;
    private Cancion cancion;

/*    @Override
    public void descargarXCancion(String nombre, String autor) {
        if (usuario.getTipo().equals(Tipo.Premium_user)) {
            System.out.println("Descargando canción:" + cancion.toString());
        } else {
            System.out.println("Acción denegada. Sólo usuarios Premium pueden descargar.");
        }
    }

    @Override
    public void descargarXCancion(String nombre, String autor) {

    }*/

    @Override
    public void descargarCancion(Cancion cancion) {
        System.out.println("******************Descargando Cancion**************************" + "\n" +
                cancion.toString() + "\n"
                );
    }
}
