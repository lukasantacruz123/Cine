package com.sample.core.service;

import com.sample.core.dao.TicketDao;
import com.sample.core.dao.TicketDAOImpl;

import java.math.BigDecimal;

public class TicketServiceImpl implements TicketService {

    private final TicketDao ticketDao = new TicketDAOImpl();

    @Override
    public void crearTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception {
        ticketDao.crearTicket(montoTotal, butacas, combosJSON, pelicula);
    }

    @Override
    public String obtenerNombrePeliculaPorFuncion(int funcionId) throws Exception {
        return ticketDao.obtenerNombrePeliculaPorFuncion(funcionId);
    }

    @Override
    public void guardarTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception {
        ticketDao.guardarTicket(montoTotal, butacas, combosJSON, pelicula);
    }
}
