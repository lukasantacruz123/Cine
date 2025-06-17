package com.sample.core.dao;

import java.math.BigDecimal;

public interface TicketDao{
    void guardarTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception;
    void crearTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception;	
    
    String obtenerNombrePeliculaPorFuncion(int funcionId);

}
