<%-- 
    Document   : inicio1
    Created on : 22/08/2021, 05:31:52 PM
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
    <%@include file="nav.jsp"%>
    <body>
         
        
           <h1 class="titulo"><b>LEYES DE TRANSITO</b></h1>
    <div class="card card1">
  <div class="card-header">
      <h3 style="font-family: optima">¿Qué Son?</h3>
  </div>
  <div class="card-body">
    <blockquote class="blockquote mb-0">
        <img class="izquierda" src="images/WhatsApp Image 2021-08-19 at 4.11.20 PM.jpeg" alt="..."/>
        <p style="font-family: optima" class="parrafo" >Las normas de tránsito, de tráfico o de circulación son las normas que 
          regulan el tráfico o circulación de vehículos. Además de determinar el 
          significado de las señales de tráfico, los semáforos y otros tipos de 
          señalización vial, marcan los principios generales y particulares por 
          los que se establece la circulación.</p>
    </blockquote>
  </div>
</div>



    <h1 class="titulo"><b>LEY 769 DE 2002 CODIGO NACIONAL DE TRANSITO</b></h1>
    <div class="container row row-cols-1 row-cols-md-3 g-4">
        <div class="col">
            <div class="card">
                <div class="box1">
                    <div class="content">
                        <h2>01</h2>
                        <h3><b>Disposiciones Generales</b></h3>
                        <p style="font-size: 20px">La normas del presente codigo rigen en todo el 
                            territorio nacional y regulan la circulaicon de los ciudadanos y vehiculos</p>
                        <a href="ley1.jsp">Leer Mas</a>
                    </div>
                </div>
            </div></div>
        <div class="col">
            <div class="card">
                <div class="box1">
                    <div class="content">
                        <h2>02</h2>
                        <h3><b>Regimen Nacional De Transito</b></h3>
                        <p style="font-size: 20px">Todo centro de enseñansa automovilistica, es 
                        un establecimiento docente de naturaleza publica</p>
                        <a href="ley2.jsp">Leer Mas</a>
                    </div>
                </div>
            </div></div>
        <div class="col">
            <div class="card">
                <div class="box1">
                    <div class="content">
                        <h2>03</h2>
                        <h3><b>Normas De Comportamiento</b></h3>
                        <p style="font-size: 20px">Todas persona que tome parte en el transito como conductor,
                        pasajero, o peaton, debe comportarse</p>
                        <a href="#">Leer Mas</a>
                    </div>
                </div>
            </div>
        </div>


    </div>

    </body>
</html>