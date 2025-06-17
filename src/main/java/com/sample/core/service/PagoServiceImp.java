package com.sample.core.service;

import com.sample.core.dao.PagoDao;
import com.sample.core.dao.PagoDaoImp;
import com.sample.core.domain.Pago;

public class PagoServiceImp implements PagoService {

    private final PagoDao pagoDao = new PagoDaoImp();

    @Override
    public boolean verificarCompra(String email, int asientoId) throws Exception {
        int salaId = pagoDao.obtenerSalaIdDeAsiento(asientoId);
        return pagoDao.yaComproEnSala(email, salaId);
    }

    @Override
    public void procesarPago(Pago pago, int asientoId) throws Exception {
        pagoDao.registrarPago(pago);
        if (asientoId > 0) {
            pagoDao.ocuparAsiento(asientoId);
        }
    }
    }

