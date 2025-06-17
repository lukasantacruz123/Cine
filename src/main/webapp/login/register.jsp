<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<link rel= "stylesheet" href= "../css/CrearCuenta.css">
    <title>Crear Cuenta - CineApp</title>
 
</head>
<body>
    <div class="login-container">
        <div class="login-header">CREAR CUENTA</div>
        <div class="login-content">
            <div class="login-left">
                <h3>COMPLETÁ TUS DATOS</h3>


             <form action="RegistroServlet" method="post">
    <label>NOMBRE</label>
    <input type="text" name="nombre" required>

    <label>CONTRASEÑA</label>
<input type="password" name="contrasena">
    <button type="submit" class="btn">REGISTRARME</button>
</form>

            </div>
        </div>
    </div>
</body>
</html>
