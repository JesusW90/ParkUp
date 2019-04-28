<%-- 
    Document   : login
    Created on : 28-abr-2019, 12:52:30
    Author     : trykdaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<t:if test="${sessionScope['sessionUsuario']!=null}">
<%response.sendRedirect("index.jsp");%>
</t:if>
<!DOCTYPE html>
<%@page session="true"import="java.util.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Inicio sesion</h1>
        <% if(request.getParameter("error")!=null){
        out.println(request.getParameter("error"));            
        }%>
        <p><a href="registro.jsp">Registrarse</a></p>
        <p style="color:#ff0000">${sessionScope['error']}</p>
        <form action ="Login"method="post">
            
        <p>Usuario:<input type="text" name="Usuario"></p>
        <p>Contraseña:<input type="password"name="Contraseña"></p>
        <p><input type="submit" value="Entrar"></p>
        </form>


    </body>
</html>
<!DOCTYPE html>
<html lang="es">
	
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width">

	<link rel="icon" type="image/png" sizes="32x32" href="img/logo-provisional.png">
	
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/grid.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/responsive.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="js/main.js"></script>
				
	<title>Parkup</title>

	<meta name="description" content="Proyecto de aparcamiento">		
	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

</head>
<body>
	<!--MOBILE-->
	<header class="col-1 mobile">
		<div class="col-1-3 mobile-bell"><i class="fas fa-bell fa-2x"></i></div>
		<a href="index.html"><div class="col-1-3"><img src="img/logo-provisional.png"></div></a>
		<div class="col-1-3 mobile-menu" id="desplegable"><i class="fas fa-bars fa-2x"></i></div>
	</header>
	<nav class="col-1 mobile-nav mobile desplegable">
		<ul>
			<li><i class="fas fa-user fa-1x"></i><span>&nbsp;&nbsp; Nombre usuario</span></li>
			<li><a href="#">Mi cuenta</a></li>
			<li><a href="#">Promociones</a></li>
			<li><a href="#">Alertas</a></li>
			<li><a href="nosotros.html">Nosotros</a></li>
			<li><a href="informacion.html">Información</a></li>
			<li><a href="contacto.html">Contacto</a></li>
			<br>
		</ul>
	</nav>

	<!--DESKTOP-->
	<header>
		<nav class="col-1 desktop">
			<div class="col-1-5"><a href="index.html"><img src="img/logo-provisional.png"></a></div>
			<div class="col-1-5 menu"><a href="promociones.html">Promociones</a></div>
			<div class="col-1-5 menu informacion"><a href="informacion.html">Información</a></div>
			<div class="col-1-5 menu"><a href="contacto.html">Contacto</a></div>
			<div class="col-1-5"><i class="fas fa-user fa-1x mobile-desktop"></i></div>
		</nav>	
		<div class="col-1">
		</div><div class="col-1-2">&nbsp;</div>
		<div class="col-1-2 desplegable-desktop">
			<ul>
				<li> Nombre usuario</li>
				<li><a href="#">Mi cuenta</a></li>
				<li><a href="#">Alertas</a></li>
				<li><a href="nosotros.html">Nosotros</a></li>
				<br>
			</ul>
	</div>
	</header>


	<!--FOOTER-->
	<footer class="col-1">
		<div class="col-1-2 footer-left">
			<p><i class="fas fa-phone"></i>&nbsp; 912345678</p>
			<br>
			<p><i class="fas fa-mobile-alt"></i>&nbsp; 612345789</p>
			<br>
			<p><i class="fas fa-map-marker-alt"></i>&nbsp; C/ Pepita Pérez, 58.</p>
			<br><br>
		</div>
		<div class="col-1-2 footer-right">
			<p><i class="fab fa-instagram"></i>&nbsp; @Parkup</p>
			<br>
			<p><i class="fab fa-facebook-square"></i>&nbsp; Parkup</p>
			<br>
			<p><i class="fab fa-twitter-square"></i>&nbsp; @Parkup</p>
			<br><br>
		</div>
		<div class="col-1">
			&copy; Todos los derechos reservados 2019.
		</div>
	</footer>
</body>

</html>
