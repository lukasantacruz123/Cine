<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*, java.util.*" %>
<%
    int salaId = 3;

    Set<String> asientosOcupados = new HashSet<>();

    try {
        Connection conn = com.sample.core.dao.config.Conexion.dameConnection();
        PreparedStatement stmt = conn.prepareStatement(
            "SELECT fila, numero FROM asientos_rescate WHERE estado = 'ocupado' AND sala_id = ?"
        );
        stmt.setInt(1, salaId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            asientosOcupados.add(rs.getString("fila") + "-" + rs.getInt("numero"));
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html lang="es">
<head>

<link rel = "stylesheet" href = "../css/style.css">
    <meta charset="UTF-8">
    <title>Selección de Butacas</title>
    
         <script>
    let selectedSeats = [];
    function toggleSeat(seat) {
        if (seat.classList.contains("occupied")) return;

        const seatId = seat.querySelector(".seat-id").value;

        if (seat.classList.contains("selected")) {
            seat.classList.remove("selected");
            selectedSeats = [];
        } else {
            // Deselecciona todos los demás asientos
            document.querySelectorAll('.seat.selected').forEach(s => s.classList.remove('selected'));
            selectedSeats = [];

            seat.classList.add("selected");
            selectedSeats.push(seatId);
        }

        updateSummary();
        updateHiddenInputs();
    }


    function updateSummary() {
        const count = selectedSeats.length;
        const price = 6300;
        const total = count * price;
        const serviceFee = count > 0 ? 1000 : 0;

        document.getElementById("selected-count").innerText = count;
        document.getElementById("selected-list").innerText = selectedSeats.join(', ');
        document.getElementById("subtotal").innerText = `$${total}`;
        document.getElementById("fee").innerText = `$${serviceFee}`;
        document.getElementById("total").innerText = `$${total + serviceFee}`;
    
        document.getElementById("hiddenSubtotal").value = total;
        document.getElementById("hiddenFee").value = serviceFee;
        document.getElementById("hiddenTotal").value = total + serviceFee;
    }

    function updateHiddenInputs() {
        const container = document.getElementById("hidden-seats");
        container.innerHTML = '';
        selectedSeats.forEach(id => {
            const input = document.createElement("input");
            input.type = "hidden";
            input.name = "selectedSeats";
            input.value = id;
            container.appendChild(input);
        });
    }

    // ✅ Función que impide avanzar sin seleccionar un asiento
    function validateForm() {
        if (selectedSeats.length === 0) {
            alert("Por favor, seleccioná al menos una butaca antes de continuar.");
            return false;
        }
        return true;
    }
</script>
</head>

<body>
<div class="container">

    <div class="left">
        <h3>HOLA CLIENTE<br>Seleccioná tus butacas:</h3>
       s
        <div class="screen">PANTALLA</div>

        <div class="seating">
            <%
                char letra = 'A';
            %>
            <div style="display: flex; align-items: center; justify-content: center; font-weight: bold;"><%= letra %></div>
            <%
                for (int col = 1; col <= 5; col++) {
                    String idAsiento = letra + "-" + col;
                    boolean ocupado = asientosOcupados.contains(idAsiento);
            %>
                    <div class="seat <%= ocupado ? "occupied" : "" %>" 
                         onclick="toggleSeat(this)" 
                         title="Fila <%= letra %>, Asiento <%= col %>">
                        <%= col %>
                        <input type="hidden" class="seat-id" value="<%= idAsiento %>">
                    </div>
            <%
                }
            %>
            <div style="display: flex; align-items: center; justify-content: center; font-weight: bold;"><%= letra %></div>
        </div>

        <div class="legend">
            <div class="legend-item"><div class="legend-box your-seat"></div> Tus butacas</div>
            <div class="legend-item"><div class="legend-box available"></div> Disponible</div>
            <div class="legend-item"><div class="legend-box occupied"></div> Ocupado</div>
        </div>
    </div>

    <div class="right">
        <div class="movie-info">
            <img src=../images/7.jpg alt="rescate">
            <h3>Rescate Implacable</h3>
            <p><strong> CINE - SALA 3</strong></p>
        </div>

        <div class="summary">
            <p><strong><span id="selected-count">0</span> ENTRADAS</strong></p>
            <p><small>(BUTACAS: <span id="selected-list">Ninguna</span>)</small></p>
            <p>Subtotal: <span id="subtotal">$0</span></p>
            <p>Cargo por servicio Entradas: <span id="fee">$0</span></p>
            <p>Cargo por servicio Candy: <span>$0</span></p>
            <p><strong>TOTAL: <span id="total">$0</span></strong></p>
        </div>
        
         <form action="<%=request.getContextPath()%>/AsientosConfirmarPago" method="post" onsubmit="return validateForm()">
       
    <div id="hidden-seats"></div>
    
    <!-- NUEVOS CAMPOS OCULTOS -->
    <input type="hidden" id="hiddenSubtotal" name="subtotalEntradas" value="0">
    <input type="hidden" id="hiddenFee" name="cargoServicioEntradas" value="0">
    <input type="hidden" id="hiddenTotal" name="totalEntradas" value="0">
    
    <div class="button-group">
        <a href="<%=request.getContextPath()%>/salas/sala3.jsp" class="nav-volver">Volver</a>
        <button type="submit" class="nav-siguente">Siguiente</button>
    </div>
</form>

    </div>
</div>
</body>
</html>
