package com.sample.core.dao;
import com.sample.core.dao.TicketDao;
import com.sample.core.dao.config.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TicketDAOImpl implements TicketDao {
   @Override
   public String obtenerNombrePeliculaPorFuncion(int funcionId) {
       System.out.println("[DEBUG] obtenerNombrePeliculaPorFuncion: funcionId = " + funcionId);
       try (Connection conn = Conexion.dameConnection();
            PreparedStatement stmt = conn.prepareStatement(
               "SELECT p.nombre FROM funciones f JOIN peliculas p ON f.id_pelicula = p.pelicula WHERE f.id_funcion = ?")) {
           stmt.setInt(1, funcionId);
           ResultSet rs = stmt.executeQuery();
           if (rs.next()) {
               String nombre = rs.getString("nombre");
               System.out.println("[DEBUG] Nombre de película encontrado: " + nombre);
               return nombre;
           } else {
               System.out.println("[DEBUG] No se encontró película para la función " + funcionId);
           }
       } catch (SQLException e) {
           System.err.println("[ERROR] SQLException en obtenerNombrePeliculaPorFuncion:");
           e.printStackTrace();
       }
       return "";
   }
   @Override
   public void crearTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula) throws Exception {
       System.out.println("[DEBUG] crearTicket llamado con:");
       System.out.println("  montoTotal = " + montoTotal);
       System.out.println("  butacas = " + butacas);
       System.out.println("  combosJSON = " + combosJSON);
       System.out.println("  pelicula = " + pelicula);
       guardarTicket(montoTotal, butacas, combosJSON, pelicula); // reutiliza el método
   }
   @Override
   public void guardarTicket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula)
           throws Exception {
       System.out.println("[DEBUG] guardarTicket iniciado con:");
       System.out.println("  montoTotal = " + montoTotal);
       System.out.println("  butacas = " + butacas);
       System.out.println("  combosJSON = " + combosJSON);
       System.out.println("  pelicula = " + pelicula);
       try (Connection conn = Conexion.dameConnection();
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO ticket (monto_total, butacas, combos, pelicula) VALUES (?, ?, ?, ?)")) {
           stmt.setBigDecimal(1, montoTotal);
           stmt.setString(2, butacas);
           stmt.setString(3, combosJSON);
           stmt.setString(4, pelicula);
           int rowsInserted = stmt.executeUpdate();
           System.out.println("[DEBUG] executeUpdate retornó: " + rowsInserted + " fila(s) insertada(s)");
       } catch (SQLException e) {
           System.err.println("[ERROR] SQLException en guardarTicket:");
           e.printStackTrace();
           throw new Exception("Error al guardar el ticket", e);
       }
   }
}
