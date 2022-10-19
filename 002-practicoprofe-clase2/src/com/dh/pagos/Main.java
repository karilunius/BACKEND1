package com.dh.pagos;

import com.dh.pagos.model.Tarjeta;
import com.dh.pagos.model.TarjetaCredito;
import com.dh.pagos.model.TarjetaDebito;
import com.dh.pagos.model.Tipo;
import com.dh.pagos.service.PagoService;
import com.dh.pagos.service.impl.ProcesadorCredito;
import com.dh.pagos.service.impl.ProcesadorDebito;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ParseException {
        // A modo de ejemplo, para evitar concatenar ifs, armamos un mapa con las posibles implementaciones
        Map<String, PagoService> procesadoresDePago = Map.of("Credito", new ProcesadorCredito(), "Debito", new ProcesadorDebito());

        Date fechaExpiracion = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-29");
        Tarjeta tarjetaCredito = new TarjetaCredito("1111222233334444", "001", fechaExpiracion, Tipo.CREDITO, 300000.0, 60000.0);


        fechaExpiracion = new SimpleDateFormat("yyyy-MM-dd").parse("2020-06-29");
        Tarjeta tarjetaDebito = new TarjetaDebito("5555666677778888", "002", fechaExpiracion, Tipo.DEBITO, 150000.0);

        PagoService procesadorDePago = procesadoresDePago.get("Credito");
        System.out.println("Pago realizado : " + procesadorDePago.procesarPago(tarjetaCredito, 79000.50));
        procesadorDePago = procesadoresDePago.get("Debito");
        System.out.println("Pago realizado : " + procesadorDePago.procesarPago(tarjetaDebito, 79000.50));
    }
}
