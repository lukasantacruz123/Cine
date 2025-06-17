<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession sessionUser = request.getSession(false);
    if (sessionUser == null || sessionUser.getAttribute("user") == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - CineApp</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h2>Bienvenido a CineApp</h2>
    <a href="peliculas.jsp">Ver Películas</a>
    <a href="salas.jsp">Ver Salas</a>
    <a href="logout.jsp">Cerrar Sesión</a>
</body>
</html>
