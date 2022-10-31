package com.company;

public class parte1 {
    /*public static void main(String[] args) {

        //PARTE 1
        Cuenta cuenta = new CuentaCajaAhorro();
        cuenta.setSaldo(1000);
        cuenta.extraer(500);

        System.out.println(cuenta.getSaldo() + "cuenta ahorro se sacó 500");
        //resultado consola 500

        //PARTE 2
        Cuenta cuenta1 = new CuentaCajaAhorro();
        cuenta1.setSaldo(1000);
        cuenta1.extraer(1100);

        System.out.println(cuenta1.getSaldo() + "cuenta ahorro arroja false monto mayor a saldo");
        //resultado en consola 1000 porque no puede tener más, no lo extrajo

        //PARTE 3
        Cuenta cuenta3 = new CuentaCorriente();
        cuenta3.setSaldo(1000);
        cuenta3.extraer(1100);

        System.out.println(cuenta3.getSaldo() + "cuenta corriente , solo saca porque no hay limite, luego se paga al banco");
        //resultado en consola negativo porque dejo extraer y resto

        //VINCULACION DINAMICA - POLIMORFICO(se comporta diferente)

        //aHORA SE ensaya que una cuenta ahorro que limita sacar el dinero
        //luego de crearla se comporte como cuenta corriente

        Cuenta cuenta4 = new CuentaCajaAhorro();
        cuenta4.setSaldo(1000);
        //polimorfismo
        cuenta.extraer(1100);
        //deberia no dejar -sino que muestra el saldo 1000

        Cuenta cuenta5 = new CuentaCorriente();
        cuenta5.setSaldo(cuenta4.getSaldo());
        cuenta4 = cuenta5;

        cuenta4.extraer(1100);
        System.out.println(cuenta4.getSaldo() + "la cuenta de ahorro4 se comporta como cuenta corriente5");
        //la solucion de repetir esto por causa de la herencia es pasarla a composición video1 min16:17
*/
    }
}
