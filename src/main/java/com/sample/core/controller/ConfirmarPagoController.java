	package com.sample.core.controller;
	
	import com.sample.core.dao.ConfirmarPagoDao;
	import com.sample.core.dao.ConfirmarPagoDaoImp;
	
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;
	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.*;
	
	@WebServlet("/ConfirmarPagoController")
	public class ConfirmarPagoController extends HttpServlet {
	
	    private ConfirmarPagoDao confirmarPagoDao = new ConfirmarPagoDaoImp();
	
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setCharacterEncoding("UTF-8");
	
	        // Obtener parámetros del formulario
	        String nombre = request.getParameter("nombre");
	        String apellido = request.getParameter("apellido");
	        String dni = request.getParameter("dni");
	        String email = request.getParameter("email");
	        String metodoPago = request.getParameter("metodoPago");
	        String pelicula = request.getParameter("pelicula");
	        String totalEntradas = request.getParameter("totalEntradas");
	        String totalCombos = request.getParameter("totalCombos");
	        
	        System.out.println("Datos recibidos:");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("DNI: " + dni);
	        System.out.println("Email: " + email);
	        System.out.println("Método de pago: " + metodoPago);
	        System.out.println("Película: " + pelicula);
	        System.out.println("Total entradas: " + totalEntradas);
	        System.out.println("Total combos: " + totalCombos);
	
	        double monto;
	        try {
	            double entradas = Double.parseDouble(totalEntradas != null ? totalEntradas : "0");
	            double combos = Double.parseDouble(totalCombos != null ? totalCombos : "0");
	            monto = entradas + combos;
	        } catch (NumberFormatException e) {
	            response.sendRedirect("MetodoDePago.jsp?error=montosInvalidos");
	            return;
	        }
	
	        String combosJSON = request.getParameter("combosJSON");
	        if ((combosJSON == null || combosJSON.isEmpty()) && request.getSession().getAttribute("combosSeleccionados") != null) {
	            combosJSON = (String) request.getSession().getAttribute("combosSeleccionados");
	        }
	
	        String[] selectedSeats = request.getParameterValues("selectedSeats");
	        if (selectedSeats == null || selectedSeats.length == 0) {
	            response.sendRedirect("MetodoDePago.jsp?error=asientos");
	            return;
	        }
	
	        if (nombre == null || apellido == null || dni == null || metodoPago == null || pelicula == null) {
	            response.sendRedirect("MetodoDePago.jsp?error=datos");
	            return;
	        }
	
	        try {
	            int compraId = confirmarPagoDao.guardarCompra(nombre, apellido, dni, email, metodoPago, monto);
	            if (compraId == -1) {
	                response.sendRedirect("MetodoDePago.jsp?error=compra");
	                return;
	            }
	
	            confirmarPagoDao.actualizarAsientos(pelicula, selectedSeats);
	
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.sendRedirect("MetodoDePago.jsp?error=sql");
	            return;
	        }
	
	        // Pasar atributos para mostrar en ticket
	        request.setAttribute("nombre", nombre);
	        request.setAttribute("apellido", apellido);
	        request.setAttribute("dni", dni);
	        request.setAttribute("email", email);
	        request.setAttribute("metodoPago", metodoPago);
	        request.setAttribute("monto", String.valueOf(monto));
	        request.setAttribute("selectedSeats", selectedSeats);
	        request.setAttribute("pelicula", pelicula);
	        request.setAttribute("combosSeleccionados", combosJSON);
	        request.setAttribute("totalEntradas", totalEntradas);
	        request.setAttribute("totalCombos", totalCombos);
	        request.setAttribute("montoTotal", monto);
	
	        request.getRequestDispatcher("/pagos/Ticket.jsp").forward(request, response);
	    }
	}
