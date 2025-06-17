package com.sample.core.domain;

public class Usuario extends GenericEntity{
	
	private String usuario;
	private String contrasena;
	

	public Usuario(int id, String usuario, String password) {
		super.setId(id);
		this.usuario = usuario;
		this.contrasena = contrasena;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getPassword() {
		return contrasena;
	}



	public void setPassword(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
