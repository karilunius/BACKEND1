package Model;

import Interfaces.Figura;

public class Cuadrado  implements Figura {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
