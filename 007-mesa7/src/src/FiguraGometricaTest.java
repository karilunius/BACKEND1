import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraGometricaTest {
    FiguraGeometrica circulo;
    FiguraGeometrica cuadrado;

    @BeforeEach
    void doBefore(){
        circulo = new FiguraGeometrica("Circulo");
        cuadrado = new FiguraGeometrica("Cuadrado");

    }
    @Test
    void getcalcularArea(){
        Assertions.assertEquals(50.26548245743669,circulo.calcularArea(4));
        Assertions.assertEquals(16,cuadrado.calcularArea(4));
    }
}
