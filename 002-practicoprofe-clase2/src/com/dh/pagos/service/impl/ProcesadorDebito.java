package com.dh.pagos.service.impl;

import com.dh.pagos.model.Tarjeta;
import com.dh.pagos.model.TarjetaDebito;
import com.dh.pagos.model.Tipo;
import com.dh.pagos.service.PagoService;

public class ProcesadorDebito extends PagoService {


    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaDebito tarjetaADebitar = ((TarjetaDebito) tarjeta);
        return (tarjetaADebitar.getSaldo() >= monto);

    }
}
