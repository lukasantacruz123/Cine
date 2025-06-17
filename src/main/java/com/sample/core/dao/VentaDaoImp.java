package com.sample.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sample.core.dao.config.Conexion;

public class VentaDaoImp implements VentaDao {

    @Override
    public boolean usuarioYaCompro(String email) throws Exception {
        String sql = "SELECT * FROM ventas WHERE usuario_id = (SELECT id FROM usuarios WHERE email = ?)";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    @Override
    public void registrarVenta(String email, int asientoId) throws Exception {
        String sql = "INSERT INTO ventas (usuario_id, asiento_id) VALUES ((SELECT id FROM usuarios WHERE email = ?), ?)";
        try (Connection conn = Conexion.dameConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setInt(2, asientoId);
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
}
