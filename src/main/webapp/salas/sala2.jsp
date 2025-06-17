<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    session.setAttribute("pelicula", "blanca");
%>
<!DOCTYPE html>
<html lang="es">
<head>
<link rel = "stylesheet" href = "../css/salas.css">

    <meta charset="UTF-8">
    <title>Película - Blanca Nieves</title>
    
</head>
<body>

	<div class="container">

		<!-- Izquierda -->
		<div class="left">
			<iframe src="https://www.youtube.com/embed/1rb9u366N2k"
				frameborder="0" allowfullscreen></iframe>

			<div class="movie-box">
				<img
					src="https://cinepremiere.com.mx/wp-content/uploads/2024/08/blanca-nieves-live-action-poster-768x960.jpeg"
					alt="Poster" class="poster">
				<div class="info">
					<h2>Sinopsis</h2>
					<p>¡Bienvenido al mundo de Minecraft, donde la creatividad no
						solo te ayuda a crear, es esencial para la supervivencia!...</p>

					<h2>Datos Técnicos</h2>
					<p>
						<strong>Duración:</strong> 101 min<br> <strong>Calificación:</strong>
						ATP<br> <strong>Género:</strong> Aventura, Fantasía, Familia<br>
						<strong>Director:</strong> Jared Hess<br> <strong>Reparto:</strong>
						Jack Black, Jason Momoa, Emma Myers...
					</p>
				</div>
			</div>
		</div>

		<!-- Derecha -->
		<div class="right">
			<div class="tabs">
				<div class="tab active">HOY</div>
				<div class="tab">JUE 29/MAY</div>
				<div class="tab">VIE 30/MAY</div>
				<div class="tab">SÁB 31/MAY</div>
				<div class="tab">DOM 1/JUN</div>
			</div>

			<div class="legend">
				<div class="legend-item">
					<div class="dot green"></div>
					Alta
				</div>
				<div class="legend-item">
					<div class="dot yellow"></div>
					Media
				</div>
				<div class="legend-item">
					<div class="dot red"></div>
					Baja
				</div>
				<div class="legend-item">
					<div class="dot gray"></div>
					Completa
				</div>
			</div>

			<div class="location-title">CINE</div>

			<div class="format-block">
				<div class="format-title">XD + 3D - CASTELLANO</div>
				<div class="horarios">
					<div class="horario">
						<div class="dot green"></div>
						12:00 hs
					</div>
					<div class="horario">
						<div class="dot green"></div>
						14:30 hs
					</div>
					<div class="horario">
						<div class="dot yellow"></div>
						17:00 hs
					</div>
					<div class="horario">
						<div class="dot red"></div>
						19:35 hs
					</div>
				</div>
			</div>

			<div class="format-block">
				<div class="format-title">2D - CASTELLANO</div>
				<div class="horarios">
					<div class="horario">
						<div class="dot green"></div>
						12:15 hs
					</div>
					<div class="horario">
						<div class="dot green"></div>
						12:45 hs
					</div>
					<div class="horario">
						<div class="dot green"></div>
						13:30 hs
					</div>
					<div class="horario">
						<div class="dot yellow"></div>
						14:00 hs
					</div>
					<div class="horario">
						<div class="dot yellow"></div>
						14:45 hs
					</div>
				</div>
			</div>

			<div class="format-block">
				<div class="format-title">4D + 3D - CASTELLANO</div>
				<div class="horarios">
					<div class="horario">
						<div class="dot green"></div>
						12:30 hs
					</div>
					<div class="horario">
						<div class="dot yellow"></div>
						15:00 hs
					</div>
					<div class="horario">
						<div class="dot red"></div>
						17:30 hs
					</div>
					<div class="horario">
						<div class="dot gray"></div>
						20:00 hs
					</div>
				</div>
			</div>

			<div class="btn-group">
				<a href="salas.jsp" class="btn">Volver</a> 
				<a id="btnSiguiente" href="#" class="btn">Siguiente</a>
			</div>
		</div>

	</div>
	<script>
document.querySelectorAll('.tab').forEach(tab => {
	tab.addEventListener('click', function () {
		// Quitar clase active a todos
		document.querySelectorAll('.tab').forEach(t => t.classList.remove('active'));
		// Agregar clase active al clickeado
		this.classList.add('active');
	});
});
</script>
	
	<script>
let horarioSeleccionado = null;
let formatoSeleccionado = null;

document.querySelectorAll('.format-block').forEach(block => {
    const formato = block.querySelector('.format-title').innerText.trim();

    block.querySelectorAll('.horario').forEach(horario => {
        horario.addEventListener('click', function () {
            // Quitar selección anterior
            document.querySelectorAll('.horario.selected').forEach(h => h.classList.remove('selected'));

            // Marcar el horario clickeado
            this.classList.add('selected');

            // Guardar datos seleccionados
            horarioSeleccionado = this.innerText.trim();
            formatoSeleccionado = formato;

        });
    });
});
</script>


	<script>
document.getElementById("btnSiguiente").addEventListener("click", function (e) {
    e.preventDefault();
    
    if (!horarioSeleccionado || !formatoSeleccionado) {
        alert("Por favor, seleccioná un horario antes de continuar.");
        return;
    }
    
    const cine = "Cinemark Alto Avellaneda";

    // Guardar en localStorage
    localStorage.setItem("cine", cine);
    localStorage.setItem("formato", formatoSeleccionado);
    localStorage.setItem("horario", horarioSeleccionado);

    // Redirigir a Butacas
    window.location.href = "<%=request.getContextPath()%>/butacas/Butaca2.jsp";
});
</script>
</body>

</html>
