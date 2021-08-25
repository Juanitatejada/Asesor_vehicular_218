<%-- 
    Document   : recarga
    Created on : 24/08/2021, 06:40:56 PM
    Author     : Melani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/css.css" rel="stylesheet" type="text/css"/>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    </head>
    <%@include file="nav.jsp" %>
    <%@include file="nav1.jsp" %>
    <body>
        <div class="uno">
        <h1 class="titulo">Agregar Recarga</h1>
        
        <form class="container3 row" action="informe.jsp" method="post">
            <div class="col-sm-6">
                    <label for="nombre">Fecha</label>
                    <input class="form-control" type="date" name="fecha" id="date" placeholder="fecha" required>
                </div>
            <div class="col-sm-6">
                <label for="name">Hora</label>
                <input class="form-control" type="time" name="fecha" id="date" placeholder="Fecha" required>
            </div>
            
            <div>
                <label for="name" style="margin-top: 10px;">Odometro</label>
                <input class="form-control" type="number" name="odometro" id="text" placeholder="Odometro" required>
            </div>
            <div>
                <label for="name" style="margin-top: 10px;">Combustible</label>
                <input class="form-control" type="text" name="odometro" id="text" placeholder="Combustible" required>
            </div>
            
            <div class="col-sm-4" style="margin-top: 10px;">
                    <label for="nombre" >Gasolina</label>
                    <input class="form-control" type="tex" name="fecha" id="date" placeholder="Precio/Gal" required>
                </div>
            <div class="col-sm-4" style="margin-top: 10px;">
                <label for="name"></label>
                <input class="form-control" type="text" name="fecha" id="date" placeholder="Costo total" required>
            </div>
            <div class="col-sm-4" style="margin-top: 10px;">
                <label for="name"></label>
                <input class="form-control" type="text" name="fecha" id="date" placeholder="Galones" required>
            </div>
            <button name="enviar" type="submit" class="btn btn-primary" style="width: 100px;">Guardar <i class="fas fa-save-alt"></i></button>
        </form>
        
       
        </div>
    </body>
</html>
