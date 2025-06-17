package com.sample.core.dao;

import com.sample.core.dao.PagoDaoImp;
import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Pago;

import java.sql.*;

public class PagoDaoImp implements PagoDao {

    @Override
    public boolean yaComproEnSala(String email, int salaId) throws Exception {
        String sql = "SELECT COUNT(*) FROM pagos p " +
                     "JOIN asientos a ON a.estado = 'ocupado' AND a.sala_id = ? AND p.email = ?";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, salaId);
            stmt.setString(2, email);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next() && rs.getInt(1) > 0;
            }
        }
    }

    @Override
    public void registrarPago(Pago pago) throws Exception {
        String sql = "INSERT INTO pagos (email, metodo_pago, monto, fecha) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pago.getEmail());
            stmt.setString(2, pago.getMetodoPago());
            stmt.setDouble(3, pago.getMonto());
            stmt.setDate(4, Date.valueOf(pago.getFecha()));
            stmt.executeUpdate();
        }
    }

    @Override
    public void ocuparAsiento(int asientoId) throws Exception {
        String sql = "UPDATE asientos SET estado = 'ocupado' WHERE id = ?";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, asientoId);
            stmt.executeUpdate();
        }
    }

    @Override
    public int obtenerSalaIdDeAsiento(int asientoId) throws Exception {
        String sql = "SELECT sala_id FROM asientos WHERE id = ?";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, asientoId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("sala_id");
                } else {
                    throw new Exception("No se encontró sala para el asiento.");
                }
            }
        }
    }
}
