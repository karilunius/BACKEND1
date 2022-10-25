import java.util.List;

public class Documento {
    private String url;
    private String id;
    private String contenido;


    public Documento(String url, String id, String contenido) {
        this.url = url;
        this.id = id;
        this.contenido = contenido;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "url='" + url + '\'' +
                ", id='" + id + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
