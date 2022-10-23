import java.util.List;

public class Usuario {
    private Integer identificador;
    private Tipo tipo;


    //constructor

    public Usuario(Integer identificador, Tipo tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    //getter & setters

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    //to string


    @Override
    public String toString() {
        return "Usuario{" +
                "identificador=" + identificador +
                ", tipo=" + tipo +
                '}';
    }
}
