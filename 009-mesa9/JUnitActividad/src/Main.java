import Model.Circulo;
import Model.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(2);

        System.out.println(circulo.calcularArea());
        System.out.println(cuadrado.calcularArea());
    }
}