package company;
//DEJA DE SER ABSTRACTA
public class Cuenta {
    private int numero;
    private double saldo;

    private EstrategiaExtraccion estrategia;

    //se crea un metodo que permita setear esta estrategia
    //se puede poner en el constructor o en un metodo set

    public void setEstrategia(EstrategiaExtraccion estrategia) {
        this.estrategia = estrategia;
    }

    //----

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //metodo INVOCA A ESTRATEGIA
    public boolean extraer(double monto){
        return estrategia.extraer(this,monto);
    }
}
