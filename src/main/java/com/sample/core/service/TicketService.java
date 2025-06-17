package com.sample.core.service;
import java.math.BigDecimal;
public interface TicketService {
   void crearTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception;
   String obtenerNombrePeliculaPorFuncion(int funcionId) throws Exception;
	void guardarTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception;
}
