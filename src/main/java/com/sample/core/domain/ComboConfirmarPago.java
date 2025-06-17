package com.sample.core.domain;

import com.sample.core.service.TicketService;
import com.sample.core.service.TicketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/ComboConfirmarPago")
public class ComboConfirmarPago extends HttpServlet {

    private final TicketService ticketService = new TicketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // Parámetros recibidos desde el formulario o llamada AJAX
        String combosJSON = request.getParameter("combosJSON");
        String totalEntradasParam = request.getParameter("totalEntradas");
        String selectedSeats = request.getParameter("selectedSeats");
        String funcionIdParam = request.getParameter("funcionId");

        HttpSession session = request.getSession();

        // Guardar en sesión si se recibió
        if (combosJSON != null) {
            session.setAttribute("combosSeleccionados", combosJSON);
        }

        if (totalEntradasParam != null) {
            session.setAttribute("totalCombos", totalEntradasParam);
        }

        // Validar y convertir cantidad de entradas
        BigDecimal totalEntradas;
        try {
            totalEntradas = new BigDecimal(totalEntradasParam);
        } catch (NumberFormatException e) {
            throw new ServletException("El valor de totalEntradas no es válido: " + totalEntradasParam, e);
        }

        // Obtener nombre de la película a partir del ID de función
        String nombrePelicula = "";
        if (funcionIdParam != null) {
            try {
                int funcionId = Integer.parseInt(funcionIdParam);
                nombrePelicula = ticketService.obtenerNombrePeliculaPorFuncion(funcionId);
            } catch (NumberFormatException e) {
                throw new ServletException("El ID de la función no es válido: " + funcionIdParam, e);
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        // Crear ticket
        try {
            ticketService.crearTicket(
                totalEntradas,
                selectedSeats != null ? selectedSeats : "",
                combosJSON != null ? combosJSON : "",
                nombrePelicula
            );
        } catch (Exception e) {
            throw new ServletException("Error al guardar el ticket", e);
        }

        // Redirigir a la página de método de pago
        request.getRequestDispatcher("/pagos/MetodoDePago.jsp").forward(request, response);
    }
}
