<%-- 
    Document   : newjsp
    Created on : 19/08/2021, 08:43:53 AM
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
            <form class="form1"style="background-color: black" action="inicio1.jsp" method="post">
                <div class="con">
                    <header class="head-form">
                        <h2 class="sesion"style="color: white"  >INICIAR SESION</h2>
                        </header>
                    <br>
                    <div>
                        <label for="exampleInputEmail1" class="form-label" style="color: azure">Correo Electronico</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
                        <div class="contraseña">
                        <label for="exampleInputPassword1" class="form-label" style="color: azure">Contraseña</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" required>
                        </div>
                    </div>

                    <button class="btn1 btn-outline-ligth" >INICIAR SESION</button>
                     
                                            </div>
               
                

                    </div>

                </div>

        </div>
    </body>
</html>
