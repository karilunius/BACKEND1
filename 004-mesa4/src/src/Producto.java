public class Producto {

    //ATRIBUTOS
    private String nombre;

    private Tipo envase;
    private int lote, peso;


    //CONSTRUCTOR

    public Producto(String nombre, Tipo envase, int lote, int peso) {
        this.nombre = nombre;
        this.envase = envase;
        this.lote = lote;
        this.peso = peso;
    }

    public Producto() {
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getEnvase() {
        return envase;
    }

    public void setEnvase(Tipo envase) {
        this.envase = envase;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    //METODOS


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", envase=" + envase +
                ", lote=" + lote +
                ", peso=" + peso +
                '}';
    }
}
