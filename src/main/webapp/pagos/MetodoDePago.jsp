<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="es">
<head>
<link rel="stylesheet" href="../css/metodopago.css">
    <meta charset="UTF-8">
    <title>Método de Pago</title>
      
</head>
<body>

<div class="form-container">
    <div class="banner">POR FAVOR VALIDÁ Y COMPLETÁ TUS DATOS</div>

  <%
        String error = request.getParameter("error");
        if (error != null) {
    %>
        <div style="color:red; text-align:center; margin-bottom:10px;">
            <% if ("datos".equals(error)) { %>
                Faltan datos obligatorios.
            <% } else if ("monto".equals(error)) { %>
                Monto inválido.
            <% } else if ("sql".equals(error)) { %>
                Error al guardar el pago en la base de datos.
            <% } else if ("registro".equals(error)) { %>
                No se pudo registrar el pago.
            <% } else if ("nologueado".equals(error)) { %>
                Debés iniciar sesión para realizar el pago.
            <% } %>
        </div>
    <% } %> 
<%
    double totalEntradas = 0;
    double totalCombos = 0;

    if (session.getAttribute("totalEntradas") != null) {
        totalEntradas = Double.parseDouble((String) session.getAttribute("totalEntradas"));
    }
    if (session.getAttribute("totalCombos") != null) {
        totalCombos = Double.parseDouble((String) session.getAttribute("totalCombos"));
    }

    double montoTotal = totalEntradas + totalCombos;
%>
    <form action="<%=request.getContextPath()%>/ConfirmarPagoController" method="post">
        <div class="row">
            <div>
                <label for="nombre">Nombre*</label>
                <input type="text" name="nombre" required>
            </div>
            <div>
                <label for="apellido">Apellido*</label>
                <input type="text" name="apellido" required>
            </div>
        </div>

        <label for="dni">DNI (Titular de la cuenta)*</label>
        <input type="text" name="dni" required>

        <label>Fecha de nacimiento*</label>
        <div class="row">
            <select name="anio" required>
                <option>Año</option>
                <% for(int i = 2024; i >= 1920; i--) { %>
                    <option><%= i %></option>
                <% } %>
            </select>
            <select name="mes" required>
                <option>Mes</option>
                <% for(int i = 1; i <= 12; i++) { %>
                    <option><%= i %></option>
                <% } %>
            </select>
            <select name="dia" required>
                <option>Día</option>
                <% for(int i = 1; i <= 31; i++) { %>
                    <option><%= i %></option>
                <% } %>
            </select>
        </div>

        <label for="email">Email</label>
        <input type="email" name="email">

        <div class="row">
            <div>
                <label for="titular">Nombre del titular</label>
                <input type="text" name="titular">
            </div>
            <div>
                <label for="dnit">DNI del titular</label>
                <input type="text" name="dnit">
            </div>
        </div>

        <div class="row">
            <div>
                <label for="tarjeta">Número de tarjeta</label>
                <input type="text" name="tarjeta" placeholder="0000 0000 0000 0000">
            </div>
            <div>
                <label for="codigo">Código de seguridad</label>
                <input type="password" name="codigo" maxlength="3">
            </div>
        </div>

        <label>Fecha de vencimiento</label>
        <div class="row">
            <select name="mes_vencimiento">
                <option>Mes</option>
                <% for(int i = 1; i <= 12; i++) { %>
                    <option><%= i %></option>
                <% } %>
            </select>
            <select name="anio_vencimiento">
                <option>Año</option>
                <% for(int i = 2024; i <= 2035; i++) { %>
                    <option><%= i %></option>
                <% } %>
            </select>
        </div>

        <label for="medio_pago">Medio de pago</label>
        <select name="metodoPago" required>
            <option value="">Por favor seleccione uno</option>
            <option>Credito</option>
            <option>Debito</option>
            <option>Transferencia</option>
        </select>

        <!-- Monto fijo de ejemplo -->

    <input type="hidden" name="totalEntradas" value="<%= totalEntradas %>" />
    <input type="hidden" name="totalCombos" value="<%= totalCombos %>" />
    <input type="hidden" name="monto" value="<%= montoTotal %>" />

 <%-- Asientos seleccionados --%>
        <%
            String[] selectedSeats = (String[]) session.getAttribute("selectedSeats");
            if (selectedSeats != null) {
                for (String seat : selectedSeats) {
        %>
            <input type="hidden" name="selectedSeats" value="<%= seat %>">
        <%
                }
            }
        %>
      

        <%-- Película seleccionada desde la sesión --%>
        <%
            String pelicula = (String) session.getAttribute("pelicula");
            if (pelicula != null && (pelicula.equals("mine") || pelicula.equals("blanca") || pelicula.equals("rescate") || pelicula.equals("lilo"))) {
        %>
            <input type="hidden" name="pelicula" value="<%= pelicula %>" />
        <%
            }
        %>
         <%--Combo seleccionada desde la sesión --%>
        <%
    		String combosSeleccionados = (String) session.getAttribute("combosSeleccionados");
    		if (combosSeleccionados != null) {
		%>
    		<input type="hidden" name="combosJSON" value='<%= combosSeleccionados %>' />
		<%
    		}
		%>
   

        <button class="submit-btn" type="submit">CONFIRMAR PAGO</button>
    </form>
</div>

</body>
</html>