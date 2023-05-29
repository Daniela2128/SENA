<%-- 
    Document   : EditarF
    Created on : 19/05/2023, 6:56:25 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Ficha"%>
<%@page import="modeldao.FichaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Ficha</title>
      </head>
    <body>
         <div class="container">
            <div class="col-lg-6">
         <h1>EDITAR FICHAS</h1>
          <%
         FichaDao fi= new FichaDao();
         int id= Integer.parseInt((String)request.getAttribute(("id")));
         Ficha f= new Ficha();
         f= fi.list(id);
     
     %>
        <div class="container">
            <div class="col-lg-6">
                <form action="ControladorFicha">
                    Id:<br>
                    <input class="form-control" type="number" name="txtId" value="<%=f.getId()%>"><br>
                    Codigo de la Ficha:<br>
                    <input class="form-control" type="number" name="txtcodficha" value="<%=f.getCodficha()%>"><br> 
                    Cantidad aprendices:<br>
                    <input class="form-control" type="text" name="txtcantapre" value="<%=f.getCantapre()%>"><br>
                     Codigo del programa:<br>
                    <input class="form-control" type="number" name="txtcodprod" value="<%=f.getCodprod()%>"><br> 
                     Codigo del Aprendiz:<br>
                    <input class="form-control" type="number" name="txtcodaprendiz" value="<%=f.getCodaprendiz()%>"><br> 
                    <input class="btn btn-danger" type="submit" name="accion" value="Actualizar"><br> 
                   

                    
                    
                    
                </form>
            </div>
            </div>
            
        </div>
    </body>
</html>
