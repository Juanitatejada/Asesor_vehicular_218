<%-- 
    Document   : registro
    Created on : 19/08/2021, 10:03:19 AM
    Author     : Melani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/css.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <title>JSP Page</title>



    </head>

    <body style="background: url(images/carros.jpg)">
        <div class="overlay">
            <form class="registro"style="background-color: black" action="inicio1.jsp" method="post">
                <div class="con">
                    <header class="head-form">
                        <h2 class="sesion"style="color: white"  >REGISTRARME</h2>
                    </header>
                    <br>
                    <div>
                        <div class="row">
                            <div class="col">
                                <label for="exampleName" class="form-label" style="color: azure">Primer Nombre</label>
                                <input type="name" class="form-control" id="exampleName" required> 
                            </div>
                            <div class="col">
                                <label for="exampleName" class="form-label" style="color: azure">Segundo Nombre</label>
                                <input type="name" class="form-control" id="exampleName" required> 
                            </div>
                        </div>
                        <label for="exampleLastName" class="form-labe" style="color: azure">Apellidos</label>
                        <input type="lastname" class="form-control" id="exampleLastName" required> 
                        <label for="exampleInputEmail1" class="form-label" style="color: azure">Correo Electronico</label>
                        <input type="email"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
                        <div class="row">
                            <div class="col">
                                <label for="exampleLastName" class="form-labe" style="color: azure">Contraseña</label>
                                <input type="lastname" class="form-control" id="exampleLastName" required>                             </div>
                            <div class="col">
                                <label for="exampleLastName" class="form-labe" style="color: azure">Confirme Contraseña</label>
                                <input type="lastname" class="form-control" id="exampleLastName" required>                             </div>
                        </div>
                    </div>
                    <select class="form-select" aria-label="Default select example">
                        <option selected>Elija Su Tipo De Vehciulo</option>
                        <option value="1">Carro</option>
                        <option value="2">Moto</option>
                        </select>
                   <br>
                   <button class="log-in btn-outline-dark">Registrarme</button>
                   
                  
                </div>

        </div>

    </div>
</body>

</html>
