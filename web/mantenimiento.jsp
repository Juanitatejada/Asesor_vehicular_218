<%-- 
    Document   : mantenimiento
    Created on : 24/08/2021, 07:03:29 AM
    Author     : Melani
--%>

<%@page import="ppi.ListaLigadaSimple"%>
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

        
        <h1 class="titulo">Mantenimientos Registrados</h1>
        <div class="uno">
    <table class="table table-striped table-bordered ">
        <thead class="table-success table-bordered" style="border-color: #000">

            <tr style="text-align: center">
                <th scope="col">NOMBRE SERVICIO</th>
                <th scope="col">HORA SERVICIO</th>
                <th scope="col">FECHA SERVICIO</th>
                <th scope="col">KILOMETRAJE VEHICULO</th>

                           </tr>

        </thead>
        <tbody>

            <%
                ListaLigadaSimple lista = (ListaLigadaSimple) session.getAttribute("lista1");
                if (lista != null) {
                    String nombreServicio = request.getParameter("nombreservicio");
                    String horaServicio = request.getParameter("horaServicio");
                    String fechaServicio = request.getParameter("fechaServicio");
                    String kilometrajeVehiculo = request.getParameter("kilometrajeVehiculo");

                    if (nombreServicio != null) {
                        lista.insertarPrincipioNodo(nombreServicio, fechaServicio, horaServicio, kilometrajeVehiculo);
                        lista.mostrar();
                        for (int i = 0; i < lista.getTamaño(); i++) {
            %>
            <tr>

                <td><%= lista.ObtenerMantenimiento(i).nombreServicio%></td>
                <td><%= lista.ObtenerMantenimiento(i).fechaServicio%></td>
                <td><%= lista.ObtenerMantenimiento(i).horaServicio%></td>
                <td><%= lista.ObtenerMantenimiento(i).kilometrajeVehiculo%></td>


            </tr>



            <%
                }
            %>
        </tbody>
    </table>
        </div>

    <%
            }
        } else {
            lista = new ListaLigadaSimple();
            lista.destruir();
            session.setAttribute("lista1", lista);
        }
    %>
   



</body>
</html>
