package com.sample.core.service;

import java.util.List;
import com.sample.core.domain.Salas;

public interface SalasService {
    void crearSala(int precio, String descripcion) throws Exception;

    List<Salas> listarSalas() throws Exception;

    Salas consultarSalaPorId(int id) throws Exception;



	static Salas consultarSalas(int int1) {
		// TODO Auto-generated method stub
		return null;
	}
}
