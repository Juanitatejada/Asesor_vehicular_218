<%-- 
    Document   : agregar_mantenimiento
    Created on : 24/08/2021, 07:40:03 AM
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
    <%@include file="nav.jsp"%>
    <body>
        
        
        <div class="uno">
            <h1 class="titulo">Agregar Mantenimeinto Realizado</h1>
            
                 <div class="container3 mt-5">
            <form action="mantenimiento.jsp" method="post">
                <div class="form-group mb-4">
                    <label for="nombre">nombreServicio</label>
                    <input class="form-control" type="text" name="nombreServicio" id="nombres" placeholder="nombreservicio" required>
                </div>
                <div class="form-group mb-3">
                    <label for="nombre">fechaServicio</label>
                    <input class="form-control" type="date" name="fechaServicio" id="date" placeholder="fechaServicio" required>
                </div>
                <div class="form-group mb-3">
                    <label for="nombre">horaServicio</label>
                    <input class="form-control" type="time" name="horaServicio" id="time" placeholder="horaServicio" required>
                </div>
                <div class="form-group mb-3">
                    <label for="nombre">kilometrajeVehiculo</label>
                    <input class="form-control" type="text" name="kilometraje" id="text" placeholder="kilometrajeVehiculo">
                </div>
                <button name="enviar" type="submit" class="btn btn-primary">Guardar <i class="fas fa-save-alt"></i></button>
            </form>
        </div>
        <br>
        <br>
        <br>
        <br>
            </form>
        </div>
            
        </div> 
        <h1 class="titulo">Agregar Mantenimiento Disponible</h1>
   
    </body>
</html>
