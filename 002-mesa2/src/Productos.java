import java.util.ArrayList;

public class Productos {

     private String nombreProducto;
     private Double precioProducto;


    public Productos(String nombreProducto, Double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }





    Productos productoBase = new Productos("Menu Base",7000.00);

    Productos Menu1 = new Productos("Menu Clásico",7000.00);
    Productos Menu2 = new Productos("Menu Infantil",7000.00);
    Productos Menu3 = new Productos("Menu Vegetariano",7000.00);
    Productos productoad1 = new Productos("Juguete",3.0);
    Productos productoad2 = new Productos("Especias",0.0);
    Productos productoad3 = new Productos("Salsa Vegetariana",2.00);




    @Override
    public String toString(){
        return "Productos{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto='" + precioProducto + '\'' +
                '}';
    }
}
