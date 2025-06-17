package com.sample.core.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;


@WebServlet("/create_payment")
public class CreatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Lógica de integración con Mercado Pago

        JsonObject json = new JsonObject();
        json.addProperty("payment_url", "https://www.mercadopago.com.ar/checkout");

        response.getWriter().write(json.toString());
    }
}