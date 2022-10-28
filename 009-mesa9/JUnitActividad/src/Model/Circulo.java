package Model;

import Interfaces.Figura;

public class Circulo implements Figura {

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area: " + this.radio * this.radio * 3.14);
        return this.radio * this.radio * 3.14;
    }
}
