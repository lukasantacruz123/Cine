package com.sample.core.service;

import com.sample.core.dao.ComboDao;
import com.sample.core.controller.combo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboServiceImpl implements ComboService {

    @Autowired
    private ComboDao comboDao;

    @Override
    public List<Combo> obtenerCombos() {
        return comboDao.listarCombos();
    }

	@Override
	public List<Combo> listarCombos() {
		// TODO Auto-generated method stub
		return null;
	}
}