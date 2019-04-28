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
