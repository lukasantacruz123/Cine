 package com.sample.core.controller;

import com.sample.core.service.VentaService;
import com.sample.core.service.VentaServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CompraBoletoServlet")
public class CompraBoletoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private final VentaService ventaService = new VentaServiceImp();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("user");

        if (email == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        try {
            int asientoId = Integer.parseInt(request.getParameter("asiento_id"));

            if (ventaService.verificarCompra(email)) {
                response.sendRedirect("salas.jsp?error=Ya has comprado un boleto");
                return;
            }

            ventaService.procesarCompra(email, asientoId);
            response.sendRedirect("salas.jsp?success=Compra realizada");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
