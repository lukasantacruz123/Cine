<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - Cine</title>

    <!-- CSS personalizado -->
    <link rel="stylesheet" href="../css/login.css">

    <!-- jQuery -->
    <script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/gasparesganga-jquery-loading-overlay@2.1.7/dist/loadingoverlay.min.js"></script>

    <!-- ContextPath y JS -->
    <script type="text/javascript">
        var contextPath = '<%=request.getContextPath()%>';
    </script>
    <script src="<%=request.getContextPath()%>/scripts/login.js"></script>
</head>
<body>

    <div class="login-container">
        <div class="login-header">
            INGRESÁ TU CUENTA
        </div>

        <div class="login-content">
        
          <div class="login-right">
                <form id="LoginForm">
                
                    <label for="usuario">USUARIO</label>
                    <input type="text" class="input-login" id="usuario" name="usuario" placeholder="Ingrese su usuario">

                    <label for="password">CONTRASEÑA</label>
                    <input type="password" class="input-login" id="password" name="password" placeholder="Ingrese su contraseña">

                    <button type="button" class="btn" id="btn-login">INGRESAR</button>
             
                </form>
            </div>
        
        
        
        
        
                 <div class="login-right">
				<h3>¿NO TENÉS CUENTA?</h3>
				<a href="register.jsp" class="btn">CREAR CUENTA</a>
			</div>


          
        </div>
    </div>

</body>
</html>
