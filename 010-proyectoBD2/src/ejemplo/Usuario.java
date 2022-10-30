public class Usuario {

    private String nombre;
    private Long id;
    private String email;
    private double sueldo;

    public Usuario(String nombre,String email, double sueldo) {
        this.nombre = nombre;
        this.email = email;
        this.sueldo = sueldo;
        //NO SE PUSO ID
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //método

    public double subirSueldo(double precio){
        this.sueldo = this.sueldo + precio;
        return this.sueldo;
    }


}
