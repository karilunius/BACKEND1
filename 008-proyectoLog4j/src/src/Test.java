import java.util.logging.Logger;

public class Test {

    private static final Logger logger = Logger.getLogger(Test.class);


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1,3);
        int suma = calculadora.sumar();
        System.out.println(suma);

        Calculadora calculadora1 = new Calculadora(1,0);
        double dividir = calculadora1.dividir();
        System.out.println(dividir);

        Calculadora calculadora2 = new Calculadora(2,3);
        calculadora2.dividir();
    }

}
