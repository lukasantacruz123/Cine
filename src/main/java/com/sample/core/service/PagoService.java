package com.sample.core.service;

import com.sample.core.domain.Pago;

public interface PagoService {
    boolean verificarCompra(String email, int asientoId) throws Exception;

    void procesarPago(Pago pago, int asientoId) throws Exception;
}
