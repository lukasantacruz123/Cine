package com.sample.core.dao;

import java.util.List;
import com.sample.core.domain.Salas;

public interface SalasDao {
    List<Salas> listarSalas() throws Exception;

    Salas consultarSalas(int id) throws Exception;

    void insertarSala(int precio, String descripcion) throws Exception;
}
