package com.sample.core.service;

import com.sample.core.dao.ConfirmarPagoDao;
import com.sample.core.dao.ConfirmarPagoDaoImp;

import java.sql.SQLException;

public class ConfirmarPagoServiceImp implements ConfirmarPagoService {

    private final ConfirmarPagoDao confirmarPagoDao = new ConfirmarPagoDaoImp();

    @Override
    public int guardarCompra(String nombre, String apellido, String dni, String email, String metodoPago, double monto) throws SQLException {
        return confirmarPagoDao.guardarCompra(nombre, apellido, dni, email, metodoPago, monto);
    }

    @Override
    public void actualizarAsientos(String pelicula, String[] selectedSeats) 

throws SQLException {
        confirmarPagoDao.actualizarAsientos(pelicula, selectedSeats);
    }
}
