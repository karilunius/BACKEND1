package company;

public class CuentaCajaAhorro extends Cuenta {


    @Override
    public boolean extraer(double monto) {
        boolean resultado = false;
        if(getSaldo()>=monto){
            setSaldo(getSaldo()-monto);
            resultado = true;
        }
        return false;
    }
}
