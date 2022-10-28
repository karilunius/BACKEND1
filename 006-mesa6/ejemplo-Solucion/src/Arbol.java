public class Arbol {

    private String tipos;
    private Integer alto;
    private Integer ancho;
    private String color;

    public Arbol(String color) {
        this.color = color;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
               "tipos='" + tipos + '\'' +
               ", alto=" + alto +
               ", ancho=" + ancho +
               '}';
    }
}
