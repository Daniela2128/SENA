<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:42:59 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <title>Aprendiz</title>
    </head>
    <body>
         <div class="container">
            <div class="col-lg-6">
     <h1>EDITAR APRENDICES</h1>
     <%
         AprendizDao ape= new AprendizDao();
         int id= Integer.parseInt((String)request.getAttribute(("id")));
         Aprendiz ap= (Aprendiz)ape.list(id);
     
     %>
                <form action="ControladorAprendiz">
                     Id:<br>
                    <input class="form-control" type="number" name="txtId" value="<%=ap.getid()%>"><br> 
                   Documento del aprendiz:<br>
                    <input class="form-control" type="number" name="txtdocu" value="<%=ap.getDocu()%>"><br> 
                    Nombre del aprendiz:<br>
                    <input class="form-control" type="text" name="txtnombreap" value="<%=ap.getNombreap()%>"><br> 
                    Apellido del aprendiz:<br>
                    <input class="form-control" type="text" name="txtapellidoap" value="<%=ap.getApellidoap()%>"><br> 
                    Correo del aprendiz:<br>
                    <input class="form-control" type="email" name="txtcorreoap" value="<%=ap.getCorreoap()%>"><br> 
                    Numero del aprendiz:<br>
                    <input class="form-control" type="number" name="txtteleap" value="<%=ap.getTeleap()%>">
                    <br> 
                     <input class="form-control" name="txtid" value="<%=id%>"><br> 
                    <input class="btn btn-danger" type="submit" name="accion" value="Actualizar"><br> 
    </form>
                
            </div>
            
        </div>
        
    </body>
</html>