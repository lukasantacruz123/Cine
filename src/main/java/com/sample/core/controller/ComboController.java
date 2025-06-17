package com.sample.core.controller;

import com.sample.core.controller.combo.*;
import com.sample.core.service.ComboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

import javax.servlet.annotation.WebServlet;

@WebServlet("/combos")
public class ComboController {

    @Autowired
    private ComboService comboService;

    @GetMapping
    public String verCombos(Model model) {
        return "combos"; // JSP
    }

    @ResponseBody
    @GetMapping("/listar")
    public List<Combo> listarCombos() {
        return comboService.obtenerCombos();
    }
    
    @GetMapping("/seleccionar-combos")
    public String seleccionarCombos(@RequestParam("butacas") String butacas, Model model) {
        List<Combo> combos = comboService.listarCombos();
        model.addAttribute("combos", combos);
        model.addAttribute("butacas", butacas); // si querés guardarlas para más adelante
        return "combos"; // combos.jsp
    }

}