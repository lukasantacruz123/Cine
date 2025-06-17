<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Combos</title>
    <link rel="stylesheet" href="../css/Combo.css">
</head>
<body>

<div class="container">

    <!-- COMBOS A LA IZQUIERDA -->
    <div class="combo-container">
        <!-- Combos con imágenes de Cinemark -->
        <div class="combo-card" onclick="agregarCombo(4600, 'Pop Mediano')">
            <img src="https://static.cinemarkhoyts.com.ar/Images/ConcessionItemImageN/A000000010.png?v=00002580" alt="Combo">
            <div class="combo-nombre">Pop Mediano</div>
            <div class="combo-descripcion">1 balde + 2 gaseosas</div>
            <div class="combo-precio">$4600</div>
        </div>

        <div class="combo-card" onclick="agregarCombo(10500, 'Pop Mega Familia')">
            <img src="https://static.cinemarkhoyts.com.ar/Images/ConcessionItemImageN/A000000198.png?v=00002580" alt="Combo">
            <div class="combo-nombre">Pop Familia</div>
            <div class="combo-descripcion">2 balde + 3 gaseosas</div>
            <div class="combo-precio">$10500</div>
        </div>

        <div class="combo-card" onclick="agregarCombo(7500, 'Pop Mega Recargable')">
            <img src="https://static.cinemarkhoyts.com.ar/Images/ConcessionItemImageN/A000000199.png?v=00002580" alt="Combo">
            <div class="combo-nombre">Pop Mega Recargable</div>
            <div class="combo-descripcion">1 balde + 2 gaseosas</div>
            <div class="combo-precio">$7500</div>
        </div>

        <div class="combo-card" onclick="agregarCombo(3500, 'Pop Mega Individual')">
            <img src="https://static.cinemarkhoyts.com.ar/Images/ConcessionItemImageN/A000000197.png?v=00002580" alt="Combo">
            <div class="combo-nombre">Pop Mega Individual</div>
            <div class="combo-descripcion">1 balde + 1 gaseosa</div>
            <div class="combo-precio">$3500</div>
        </div>

        <div class="combo-card" onclick="agregarCombo(12500, 'Pop Mega Epic')">
            <img src="https://static.cinemarkhoyts.com.ar/Images/ConcessionItemImageN/A000000196.png?v=00002580" alt="Combo">
            <div class="combo-nombre">Pop Mega Epic</div>
            <div class="combo-descripcion">2 balde + 5 gaseosas</div>
            <div class="combo-precio">$12500</div>
        </div>
    </div>

    <!-- RESUMEN A LA DERECHA -->
    <div class="right">
        <h2 class="resumen-title">RESUMEN</h2>

        <div class="resumen-section">
            <span class="resumen-subtitle">Cine</span>
            <div class="resumen-item">
                <div class="icon-location"></div>
                
            </div>
        </div>

        <hr>

        <div class="resumen-section">
            <span class="resumen-subtitle">Candy</span>
            <div id="candyResumen"></div>
        </div>

        <hr>

        <div class="resumen-section">
            <p><strong><span id="selected-count">1</span> ENTRADAS</strong></p>
            <p>Cargo por servicio Entradas: <span id="fee">$7300</span></p>
            <p>Total Candy: <span id="candyTotal">0</span></p>
            <p><strong>TOTAL: <span id="total">0</span></strong></p>
        </div>

        <form id="comboForm" action="<%=request.getContextPath()%>/ComboConfirmarPago" method="post" style="display: none;">
            <input type="hidden" name="combosJSON" id="combosJSON" />
            <input type="hidden" name="selectedSeats" id="selectedSeats" />
            <input type="hidden" name="subtotalEntradas" id="subtotalEntradas" />
            <input type="hidden" name="cargoServicioEntradas" id="cargoServicioEntradas" />
            <input type="hidden" name="totalEntradas" id="totalEntradas" />
            <input type="submit" value="ConfirmarPago" />
        </form>

        <div class="resumen-footer">
            <div class="icon-bag"></div>
            <strong>$<span id="footer-total">0</span></strong>
            <a href="#" onclick="event.preventDefault(); enviarFormulario()" class="btn-continuar">CONTINUAR</a>
            <a href="#" id="process-checkout" class="btn-continuar">PAGAR</a>
        </div>
    </div>
</div>

<!-- SCRIPTS -->
<script>
let totalCandy = 0;
let comboSeleccionados = {};
const cargoServicio = 7300;

function agregarCombo(precio, nombre) {
    if (comboSeleccionados[nombre]) {
        comboSeleccionados[nombre].cantidad += 1;
    } else {
        comboSeleccionados[nombre] = { precio: precio, cantidad: 1 };
    }
    localStorage.setItem("combos", JSON.stringify(comboSeleccionados));
    renderCombos();
}

function quitarCombo(nombre) {
    if (comboSeleccionados[nombre]) {
        comboSeleccionados[nombre].cantidad -= 1;
        if (comboSeleccionados[nombre].cantidad <= 0) {
            delete comboSeleccionados[nombre];
        }
        localStorage.setItem("combos", JSON.stringify(comboSeleccionados));
        renderCombos();
    }
}

function renderCombos() {
    const container = document.getElementById("candyResumen");
    container.innerHTML = "";
    totalCandy = 0;

    for (const nombre in comboSeleccionados) {
        const combo = comboSeleccionados[nombre];
        const subtotalCombo = combo.precio * combo.cantidad;
        totalCandy += subtotalCombo;

        const item = document.createElement("div");
        item.className = "resumen-item";
        item.innerHTML = `
            <div style="display: flex; align-items: center; justify-content: space-between; width: 100%;">
                <div style="display: flex; align-items: center;">
                    <img src="images/10.png" class="resumen-img" />
                    <div class="resumen-info">
                        <span style="font-weight: bold;">${combo.cantidad} · ${nombre}</span>
                        <small>$${subtotalCombo}</small>
                    </div>
                </div>
                <div>
                    <button type="button" onclick="quitarCombo('${nombre}')">−</button>
                    <button type="button" onclick="agregarCombo(${combo.precio}, '${nombre}')">+</button>
                </div>
            </div>
        `;
        container.appendChild(item);
    }

    const totalFinal = totalCandy + cargoServicio;
    document.getElementById("candyTotal").textContent = `$${totalCandy}`;
    document.getElementById("total").textContent = `$${totalFinal}`;
    document.getElementById("footer-total").textContent = totalFinal;
}

function enviarFormulario() {
    document.getElementById("combosJSON").value = JSON.stringify(comboSeleccionados);
    document.getElementById("cargoServicioEntradas").value = cargoServicio;
    document.getElementById("totalEntradas").value = totalCandy;
    document.getElementById("comboForm").submit();
}

renderCombos();
</script>

<script>
document.getElementById('process-checkout').addEventListener('click', async () => {
    const product = {
        title: 'Combos seleccionados',
        unit_price: totalCandy + cargoServicio,
        quantity: 1,
    };

    try {
        const response = await fetch('http://localhost:3000/create_payment', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ product }),
        });

        const data = await response.json();

        if (response.ok) {
            window.location.href = data.payment_url;
        } else {
            alert('Error al procesar el pago: ' + data.error);
        }
    } catch (error) {
        console.error('Error al procesar pago:', error);
        alert('Hubo un error al procesar la solicitud de pago');
    }
});
</script>

</body>
</html>
