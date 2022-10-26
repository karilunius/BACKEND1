import java.time.LocalDate;
import java.time.Period;
import java.util.function.Supplier;

public class Persona {

    private String nombre, apellido,email;
    private LocalDate edad;


    //constructor

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    //g y s


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String mostrarNombreCompleto(){
        return this.nombre + "," + this.apellido;
    }

    public boolean mayorEdad(){
        return Period.between(this.edad,LocalDate.now()).getYears()>=18;

    }


}
