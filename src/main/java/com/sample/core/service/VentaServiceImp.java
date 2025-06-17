package com.sample.core.service;

import com.sample.core.dao.VentaDao;
import com.sample.core.dao.VentaDaoImp;

public class VentaServiceImp implements VentaService {

    private final VentaDao ventaDao = new VentaDaoImp();

    @Override
    public boolean verificarCompra(String email) throws Exception {
        return ventaDao.usuarioYaCompro(email);
    }

    @Override
    public void procesarCompra(String email, int asientoId) throws Exception {
        ventaDao.registrarVenta(email, asientoId);
        ventaDao.ocuparAsiento(asientoId);
    }
}
