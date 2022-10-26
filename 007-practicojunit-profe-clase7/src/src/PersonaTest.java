//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Persona persona;
    Persona persona1;
     Persona persona2;

    @BeforeEach
    void doBefore(){
        persona  = new Persona("Javi", "Test");
        persona.setEdad(LocalDate.of(1988,11,18));
        persona1 = new Persona("Cami","Valera");
        persona1.setEdad(LocalDate.of(1986,04,12));
        persona2 = new Persona("Vanesa","bueno");
        persona2.setEdad(LocalDate.of(1992,9,23));


    }


     @Test
    void getNombreCompleto(){
        Assertions.assertEquals("Javi,Test",persona.mostrarNombreCompleto());
     }

     @Test
     void getEdadMayor(){
        Assertions.assertEquals(TRUE,persona.mayorEdad());
     }

     @Test
    public void edad(){
        Boolean diferenciaSi = persona.mayorEdad();
        Assertions.assertTrue(diferenciaSi);
    }



}