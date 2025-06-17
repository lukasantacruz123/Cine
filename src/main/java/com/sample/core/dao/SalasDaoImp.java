package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Salas;
import com.sample.core.exceptions.ErrorException;

public class SalasDaoImp implements SalasDao{
private Conexion conexion = Conexion.getInstance();
	
	private static final String queryList = "SELECT id, descripcion FROM salas"; //cambiar
	
	private static final String queryConsultarSalas = "SELECT id, descripcion FROM salas where id=?";

	public List<Salas> listarSalas1() throws Exception {
		 ResultSet rs = null;
		 List<Salas> personas = null;
		 Salas producto = null;
		 PreparedStatement st = null;
		 try{
			st = conexion.dameConnection().prepareStatement(queryList);
			rs = st.executeQuery();
			personas = new ArrayList<Salas>();
			 while (rs.next()) {
				 producto = new Salas();
				 producto.setId(rs.getInt(1));
				 producto.setDescripcion(rs.getString(2));
				 personas.add(producto);
			}
				
		 }catch (Exception e) {
				throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		 
		return personas;
	}

	public Salas consultarSalas(int sala) throws Exception {
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 try{
			st = conexion.dameConnection().prepareStatement(queryConsultarSalas);
			st.setInt(1, sala);
			rs = st.executeQuery();
			if (rs.next()) {
				return new Salas(rs.getInt(1),rs.getString(2));
				
			}

		 }catch (Exception e) {
				throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}

	public List<Salas> listarSalas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarSala(int precio, String descripcion) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
