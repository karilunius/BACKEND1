public class ProxySpotifyService implements IntSpotifyService{

    private Usuario usuario;

    public ProxySpotifyService(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public void descargarCancion(Cancion cancion) {
        if (usuario.getTipo().equals(Tipo.Premium_user)) {
            System.out.println("****************** Cancion Spotify para escucha offline**************************" + "\n" +
                    "Hola, a ti, usuario: " + usuario.toString() + "\n" +
                            "****************** DESCARGANDO Cancion**************************" + "\n" +
                    cancion.toString() + "\n"
            );
        } else {
            System.out.println("********************************************" + "\n" +
            "Acción denegada. Sólo usuarios Premium pueden descargar." + "\n" +
            "********************************************");
        }
    }
}
