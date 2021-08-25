<%-- 
    Document   : informe
    Created on : 24/08/2021, 05:53:01 PM
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
    <%@include file="nav1.jsp"%>
    <body>
        <div class="uno">
       <h1 class="titulo">Recarga</h1>
       <table class="table table-striped table-bordered">
           <thead style="background-color: #A9DFBF; border-color: #222">

               <tr style="text-align: center">
                <th >Fecha</th> 
                <th >Hora</th>
                <th >Odometro</th>
                <th >Cobustible</th>
                <th >Gasolina</th> 

               </tr>

        </thead>
        <tbody style="border-color: #222">
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </tbody>
    </table>
       <button type="button" class="btn6 btn-outline-info"><a href="recarga.jsp" style="color: #222"><b>Agregar Recarga</b></a></button>
       
       
         <h1 class="titulo">Gasto</h1>
       <table class="table table-striped table-bordered">
           <thead style="background-color: #A9DFBF; border-color: #222">

               <tr style="text-align: center">
                <th >Fecha</th> 
                <th >Hora</th>
                <th >Odometro</th>
                <th >Tipo De Gasto</th>
                <th >Motivo Del Gasto</th> 
                <th > Nota</th>

               </tr>

        </thead>
        <tbody style="border-color: #222">
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <tr>
                <th>hola</th>
                <th>como estas</th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        </tbody>
    </table>
         <button type="button" class="btn7 btn-outline-info"><a href="gasto.jsp" style="color: #222"><b>Agregar Gasto</b></a></button>
        </div>
    </body>
</html>
