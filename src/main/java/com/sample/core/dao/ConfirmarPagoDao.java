package com.sample.core.dao;
import java.sql.SQLException;
public interface ConfirmarPagoDao {
   int guardarCompra(String nombre, String apellido, String dni, String email, String metodoPago, double monto) throws SQLException;
   void actualizarAsientos(String pelicula, String[] selectedSeats) throws SQLException;
}
