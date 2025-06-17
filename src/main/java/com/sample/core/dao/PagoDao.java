package com.sample.core.dao;

import com.sample.core.domain.Pago;

public interface PagoDao {
    boolean yaComproEnSala(String email, int salaId) throws Exception;

    void registrarPago(Pago pago) throws Exception;

    void ocuparAsiento(int asientoId) throws Exception;

    int obtenerSalaIdDeAsiento(int asientoId) throws Exception;
}
