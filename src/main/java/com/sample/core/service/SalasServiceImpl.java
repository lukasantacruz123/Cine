package com.sample.core.service;

import java.util.List;

import com.sample.core.dao.SalasDao;
import com.sample.core.dao.SalasDaoImp;
import com.sample.core.domain.Salas;

public class SalasServiceImpl implements SalasService {

    private final SalasDao salasDao = new SalasDaoImp();

    @Override
    public void crearSala(int precio, String descripcion) throws Exception {
        salasDao.insertarSala(precio, descripcion);
    }

    @Override
    public List<Salas> listarSalas() throws Exception {
        return salasDao.listarSalas();
    }

    @Override
    public Salas consultarSalaPorId(int id) throws Exception {
        return salasDao.consultarSalas(id);
    }
}
