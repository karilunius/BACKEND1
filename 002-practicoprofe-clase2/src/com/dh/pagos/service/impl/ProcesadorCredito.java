package com.dh.pagos.service.impl;

import com.dh.pagos.model.Tarjeta;
import com.dh.pagos.model.TarjetaCredito;
import com.dh.pagos.service.PagoService;

public class ProcesadorCredito extends PagoService {
    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaCredito tarjetaPorAutorizar = ((TarjetaCredito) tarjeta);
        Double saldoDisponible = tarjetaPorAutorizar.getLimite()-tarjetaPorAutorizar.getSaldoUtilizado();

        return (saldoDisponible>= monto);
    }
}
