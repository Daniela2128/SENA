<%@page import="model.Ficha"%>
<%@page import="modeldao.FichaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="container">
            <h1>EDITAR FICHAS</h1>
                <%
                FichaDao fdao=new FichaDao();
                int id= Integer.parseInt((String)request.getAttribute("id"));
                Ficha fi = new Ficha();
                fi=fdao.list(id);
                %>
                
                
                
                <form action="ControladorFicha">
                    <div class="col-lg-6">
                    Id:<br>
                    <input class="form-control" type="number" name="txtId" value="<%=fi.getId()%>"><br>
                    Codigo de la Ficha:<br>
                    <input class="form-control" type="number" name="txtcodficha" value="<%=fi.getCodficha()%>"><br> 
                    Cantidad aprendices:<br>
                    <input class="form-control" type="text" name="txtcantapre" value="<%=fi.getCantapre()%>"><br>
                     Codigo del programa:<br>
                    <input class="form-control" type="number" name="txtcodpro" value="<%=fi.getCodpro()%>"><br> 
                     Codigo del Aprendiz:<br>
                    <input class="form-control" type="number" name="txtcodaprendiz" value="<%=fi.getCodaprendiz()%>"><br> 
                    
                    <input class="btn btn-danger" type="submit" name="accion" value="Actualizar"><br> 
                    
                
                </div>
                </form>
                    </div>
                    </body>
</html>
