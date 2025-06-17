package com.sample.core.domain;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/AsientosConfirmarPago")
public class AsientosConfirmarPago extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // Recibir combos JSON
     /*   String combosJSON = request.getParameter("combosJSON");
        if (combosJSON != null) {
            request.getSession().setAttribute("combosSeleccionados", combosJSON);
        } */

        // Recibir múltiples asientos (correcto para varios <input name="selectedSeats">)
        String[] selectedSeats = request.getParameterValues("selectedSeats");
        if (selectedSeats != null) {
            request.getSession().setAttribute("selectedSeats", selectedSeats);
        }

     // En AsientosConfirmarPago.java
        request.getSession().setAttribute("subtotalEntradas", request.getParameter("subtotalEntradas"));
        request.getSession().setAttribute("cargoServicioEntradas", request.getParameter("cargoServicioEntradas"));
        request.getSession().setAttribute("totalEntradas", request.getParameter("totalEntradas"));

        request.getRequestDispatcher("/combo/Combo.jsp").forward(request, response);


    }
}