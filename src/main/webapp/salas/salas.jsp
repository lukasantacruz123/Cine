<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.sql.*, java.util.*" %>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8" />
<title>Cartelera - Salas de Cine</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />

<!-- Tu CSS debe ir después para poder sobrescribir estilos de Bootstrap -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/salas.css" />


</head>
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- Definición del contexto -->
<script>
    const contextPath = "<%=request.getContextPath()%>";
</script>

<!-- Script logout -->
<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>

<body>

	<header class="encabezado">
		<div
			class="container d-flex justify-content-between align-items-center py-3">
			<div class="d-flex align-items-center gap-3">
				<img src="https://cdn-icons-png.flaticon.com/512/744/744922.png"
					alt="Logo cine" style="width: 40px;">
				<h1 class="titulo-pagina m-0">Cine</h1>
			</div>

			<button type="button" class="btn btn-primary" id="btn-logout">Cerrar Sesión</button>
		</div>
	</header>


	<!-- NAVBAR -->

	<!-- CARTELERA -->
	<div class="cartelera my-4">

		<!-- CARRUSEL DE PELÍCULAS -->
		<div id="carouselExampleRide" class="carousel slide mx-auto"
			data-bs-ride="carousel" style="max-width: 1050px;">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="<%=request.getContextPath()%>/images/5.jpg"
						class="d-block w-100" alt="Minecraft">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath()%>/images/6.jpg"
						class="d-block w-100" alt="Blanca Nieves">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath()%>/images/7.jpg"
						class="d-block w-100" alt="Rescate Implacable">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath()%>/images/8.jpg"
						class="d-block w-100" alt="Lilo y Stich">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleRide" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Anterior</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleRide" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Siguiente</span>
			</button>
		</div>

		<!-- Miniaturas clickeables -->
		<div
			class="peliculas my-4 d-flex gap-4 justify-content-center flex-wrap">
			<div class="pelicula text-center">
				<a href="sala1.jsp"> 
						<img src="https://static.cinemarkhoyts.com.ar/Images/Posters/362b0b9682619abc4e9c1061663aedb1.jpg?v=00002541"
					 alt="Minecraft" class="pelicula-img"/>
				</a>
				<div class="titulo mt-2">MINECRAFT</div>
				<div class="estreno text-danger fw-bold">ESTRENO</div>
			</div>
			<div class="pelicula text-center">
				<a href="sala2.jsp"> 
					<img src="https://static.cinemarkhoyts.com.ar/Images/Posters/e22b65a127e28c40f3430181ee0c20be.jpg?v=00002552"
					 alt="Blanca Nieves" class="pelicula-img"/>
					
			</a>
				<div class="titulo mt-2">BLANCA NIEVES</div>
				<div class="estreno text-danger fw-bold">ESTRENO</div>
			</div>
			<div class="pelicula text-center">
				<a href="sala3.jsp"> 
					<img src="https://static.cinemarkhoyts.com.ar/Images/Posters/533706b4add9a0023dfd656f7b23fb94.jpg?v=00002552"
					 alt="Rescate" class="pelicula-img"/>
				</a>
				<div class="titulo mt-2">RESCATE IMPLACABLE</div>
				<div class="estreno text-danger fw-bold">ESTRENO</div>
			</div>
			<div class="pelicula text-center">
				<a href="sala4.jsp">
						<img src="https://sacnkprodarcms.blob.core.windows.net/content/posters/HO00010245.jpg"
					 alt="Lilo" class="pelicula-img"/>
				</a>
				<div class="titulo mt-2">LILO Y STICH</div>
				<div class="estreno text-danger fw-bold">ESTRENO</div>
			</div>
		</div>

	</div>

	<!-- JS de Bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>

	<!-- Script logout si lo necesitas -->
	<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>

</body>
</html>
