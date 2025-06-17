package com.sample.core.dao;

import com.sample.core.dao.ConfirmarPagoDao;
import com.sample.core.dao.config.Conexion;

import java.sql.*;

public class ConfirmarPagoDaoImp implements ConfirmarPagoDao {

    @Override
    public int guardarCompra(String nombre, String apellido, String dni, String email, String metodoPago, double monto) throws SQLException {
        int compraId = -1;

        try (Connection conn = Conexion.dameConnection()) {
            conn.setAutoCommit(false);

            String sqlCompra = "INSERT INTO compras (nombre, apellido, dni, email, metodo_pago, monto_total) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sqlCompra, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, nombre);
                stmt.setString(2, apellido);
                stmt.setString(3, dni);
                stmt.setString(4, email);
                stmt.setString(5, metodoPago);
                stmt.setDouble(6, monto);
                stmt.executeUpdate();

                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    compraId = rs.getInt(1);
                }
            }
            conn.commit();
        }

        return compraId;
    }

    @Override
    public void actualizarAsientos(String pelicula, String[] selectedSeats) throws SQLException {
        String nombreTablaAsientos;
        switch (pelicula.toLowerCase()) {
            case "blanca":
                nombreTablaAsientos = "asientos_blanca";
                break;
            case "mine":
                nombreTablaAsientos = "asientos_mine";
                break;
            case "rescate":
                nombreTablaAsientos = "asientos_rescate";
                break;
            case "lilo":
                nombreTablaAsientos = "asientos_lilo";
                break;
            default:
                throw new SQLException("Película inválida para actualizar asientos.");
        }

        try (Connection conn = Conexion.dameConnection()) {
            conn.setAutoCommit(false);

            String sqlAsiento = "UPDATE " + nombreTablaAsientos + " SET estado = 'ocupado' WHERE fila = ? AND numero = ?";

            try (PreparedStatement asientoStmt = conn.prepareStatement(sqlAsiento)) {
                for (String seat : selectedSeats) {
                    String[] parts = seat.split("-");
                    if (parts.length != 2) {
                        throw new SQLException("Formato de asiento inválido: " + seat);
                    }
                    String fila = parts[0];
                    int numero;
                    try {
                        numero = Integer.parseInt(parts[1]);
                    } catch (NumberFormatException e) {
                        throw new SQLException("Número de asiento inválido: " + parts[1]);
                    }

                    System.out.println("Actualizando asiento: fila " + fila + ", número " + numero);

                    asientoStmt.setString(1, fila);
                    asientoStmt.setInt(2, numero);
                    asientoStmt.addBatch();
                }
                asientoStmt.executeBatch();
            }

            conn.commit();
        }
    }
}
