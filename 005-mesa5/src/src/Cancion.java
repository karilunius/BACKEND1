import java.util.List;

public class Cancion {

    private String nombre, autor;

    //constructor

    public Cancion(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }


    //getter & setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //to string


    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
