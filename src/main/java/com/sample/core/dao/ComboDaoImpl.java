package com.sample.core.dao;

import com.sample.core.controller.combo.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ComboDaoImpl implements ComboDao {

    @Override
    public List<Combo> listarCombos() {
        List<Combo> combos = new ArrayList<>();
        combos.add(new Combo(1, "Combo Mega Recargado", "Incluye recarga de pochoclos y gaseosa", 23800, "recargado.jpg"));
        combos.add(new Combo(2, "Combo Familia", "2 Bald. pochoclos + 2 gaseosas", 32215, "familia.jpg"));
        return combos;
    }
}