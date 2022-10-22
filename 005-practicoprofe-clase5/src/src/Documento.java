import java.util.List;

public class Documento {
    private String url;
    private String id;
    private String contenido;
    private List<String>  usuariosAutorizados;

    public Documento(String url, String id, String contenido, List<String> usuariosAutorizados) {
        this.url = url;
        this.id = id;
        this.contenido = contenido;
        this.usuariosAutorizados = usuariosAutorizados;
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

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<String> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }
}
