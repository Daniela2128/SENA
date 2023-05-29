<%-- 
    Document   : EditarP
    Created on : 10/05/2023, 6:19:55 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
      <title>Programa</title>
    </head>
    <body>
         <div class="container">
            <div class="col-lg-6">
     <h1>EDITAR PROGRAMAS</h1>
         <%
         ProgramaDao pro= new ProgramaDao();
         int id= Integer.parseInt((String)request.getAttribute(("id")));
         Programa p= new Programa();
         p= pro.list(id);
     
     %>
        <div class="container">
            <div class="col-lg-6">
                <form action="../ControladorPrograma">
                    Id:<br>
                    <input class="form-control" type="number" name="txtId" value="<%=p.getid()%>"><br>
                   Codigo del programa:<br>
                    <input class="form-control" type="number" name="txtcodpro" value="<%=p.getCodprograma()%>"><br> 
                    Nombre del programa:<br>
                    <input class="form-control" type="text" name="txtnombrepro" value="<%=p.getnombrepro()%>"><br> 
                    <input class="btn btn-danger" type="submit" name="accion" value="Actualizar"><br> 

                    
                </form>
                    
            
                
            </div>
            
        </div>
        
    </body>
</html>