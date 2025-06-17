package com.sample.core.dao;

	public interface VentaDao {
	    boolean usuarioYaCompro(String email) throws Exception;

	    void registrarVenta(String email, int asientoId) throws Exception;

	    void ocuparAsiento(int asientoId) throws Exception;
	}

