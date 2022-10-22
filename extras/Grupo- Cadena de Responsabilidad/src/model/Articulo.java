package model;

public class Articulo {
    private String nombre;
    private Integer lote;
    private Integer peso;
    private Envase envasado;
    private Boolean[] control;

    public Articulo(String nombre, Integer lote, Integer peso, Envase envasado) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.envasado = envasado;
        this.control = new Boolean[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Envase getEnvasado() {
        return envasado;
    }

    public void setEnvasado(Envase envasado) {
        this.envasado = envasado;
    }

    public Boolean[] getControl() {
        return control;
    }

    public void setControl(Boolean[] control) {
        this.control = control;
    }

    public void addControl(Integer pos, Boolean estado){
        this.getControl()[pos] = estado;
    }
}
