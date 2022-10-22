import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creo canciones

        Cancion cancion1 = new Cancion("Shape of You","Ed Sheeran");
        Cancion cancion2 = new Cancion("Thinking out loud","Ed Sheeran");
        Cancion cancion3 = new Cancion("Perfect","Ed Sheeran");
        Cancion cancion4 = new Cancion("Photograph","Ed Sheeran");
        Cancion cancion5 = new Cancion("Kiss me","Ed Sheeran");

        List<Cancion> ListaCanciones = new ArrayList<>();
        ListaCanciones.add(cancion1);
        ListaCanciones.add(cancion2);
        ListaCanciones.add(cancion3);
        ListaCanciones.add(cancion4);
        ListaCanciones.add(cancion5);


        //Creo usuarios

        List<Usuario> ListaUsuarios = new ArrayList<>();

        Usuario usuariofree = new Usuario(1237777,Tipo.Free_user);
        Usuario usuarioPremium = new Usuario(1239999,Tipo.Premium_user);



        ListaUsuarios.add(usuariofree);
        ListaUsuarios.add(usuarioPremium);


        //servicio 1 de prueba

        SpotifyServiceImple servicio = new SpotifyServiceImple();

        servicio.descargarCancion(cancion1);



    }
}