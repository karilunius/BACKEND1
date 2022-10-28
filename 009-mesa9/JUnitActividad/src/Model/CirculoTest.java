package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo;
    Cuadrado cuadrado;
    @BeforeEach
    void doBefore(){
        circulo = new Circulo(2);
        cuadrado = new Cuadrado(2);
    }

    @Test
    void calcularAreaCirculo() {
        Assertions.assertEquals(12.56, circulo.calcularArea());
        Assertions.assertNotEquals(13.00, circulo.calcularArea());
    }

    @Test
    void calcularAreaCuadrado() {
        Assertions.assertEquals(4, cuadrado.calcularArea());
        Assertions.assertNotEquals(13.00, cuadrado.calcularArea());
    }
}