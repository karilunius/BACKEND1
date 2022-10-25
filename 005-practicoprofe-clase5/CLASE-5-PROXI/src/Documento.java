import java.util.List;

public class Documento {

    private String id;
    private String url;
    private String contenido;
    private List <String> list;

    public Documento(String id, String url, String contenido, List<String> list) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
