package com.sample.core.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.core.service.SalasService;
import com.sample.core.service.SalasServiceImpl;

@WebServlet( urlPatterns =  "/CrearSalas")
public class SalasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	SalasService salaservice = new SalasServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String precioString = req.getParameter("precio");
	    String descripcion = req.getParameter("descripcion");

	    if (precioString == null || precioString.trim().isEmpty() || descripcion == null || descripcion.trim().isEmpty()) {
	        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Datos inválidos");
	        return;
	    }

	    try {
	        int precioInt = Integer.parseInt(precioString);
	        salaservice.crearSala(precioInt, descripcion);
	        resp.sendRedirect("exito.jsp"); // redirigir a alguna página de éxito
	    } catch (NumberFormatException e) {
	        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Precio inválido");
	    } catch (Exception e) {
	        throw new ServletException("Error al crear la sala", e);
	    }
	}
}