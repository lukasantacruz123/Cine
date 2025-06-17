package com.sample.core.controller;

import com.sample.core.service.TicketService;
import com.sample.core.service.TicketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/TicketController")
public class TicketController extends HttpServlet {

    private final TicketService ticketService = new TicketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Obtenemos parámetros del formulario
            String montoTotalStr = request.getParameter("montoTotal");
            String butacas = request.getParameter("butacas"); // asientos separados por coma
            String combosJSON = request.getParameter("combos"); // JSON desde JS
            String pelicula = request.getParameter("pelicula"); // puede venir del session o hidden input

            BigDecimal montoTotal = new BigDecimal(montoTotalStr);

            // Guardar el ticket
            ticketService.guardarTicket(montoTotal, butacas, combosJSON, pelicula);

            // Redireccionar a una vista de éxito
            response.sendRedirect("ticketConfirmado.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al guardar el ticket: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
