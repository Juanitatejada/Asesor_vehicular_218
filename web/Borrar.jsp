<%-- 
    Document   : Borrar
    Created on : 24/08/2021, 08:22:24 AM
    Author     : Melani
--%>

<%@page import="ppi.ListaLigadaSimple"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@include file="nav.jsp"%>
    <body>
          

        <%
            ListaLigadaSimple lista = (ListaLigadaSimple) session.getAttribute("lista1"); 
             lista = new ListaLigadaSimple();
             lista.destruirLista();
             request.getRequestDispatcher("mantenimiento.jsp").forward(request, response);
        
        %>
    </body>
</html>
