<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="es">
<head>
<link rel = "stylesheet" href = "../css/ticket.css">
    <meta charset="UTF-8">
    <title>Ticket de Compra</title>
   
</head>
<body>

<div class="ticket">
    <h2>¡Compra Confirmada!</h2>

    <div class="info">
        
        <p><strong>Método de Pago:</strong> <%= request.getAttribute("metodoPago") %></p>
    	<p><strong>Monto Total:</strong> $<%= String.format("%.2f", (Double)request.getAttribute("montoTotal")) %></p>
        <p><strong>Funcion:</strong> <%= request.getAttribute("pelicula") %></p>
        
    </div>

    <div class="butacas">
        <h3>Butacas seleccionadas:</h3>
        <ul style="list-style:none; padding:0;">
            <%
                String[] seats = (String[]) request.getAttribute("selectedSeats");
                if (seats != null) {
                    for (String seat : seats) {
            %>
                        <li><%= seat %></li>
            <%
                    }
                }
            %>
        </ul>
    </div>

    <a class="volver" href="/salas/salas.jsp">Volver al Inicio</a>
</div>

</body>
</html>