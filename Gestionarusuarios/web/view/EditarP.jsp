<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EDITOR DE PROGRAMAS</h1>
        <div class="container">
            <%
                ProgramaDao pro=new ProgramaDao();
                int id= Integer.parseInt((String)request.getAttribute("id"));
                
                Programa p = (Programa)pro.list(id);
                %>
            <div class="col-lg-6">
                <form action="ControladorPrograma">
                    Codigo del Programa:<br>
                    <input class="form-control" type="number" name="txtcodprograma" value="<%=p.getCodprograma()%>"><br> <br> 
                    Nombre del programa:<br>
                    <input class="form-control" type="text" name="txtnombrepro" value="<%=p.getnombrepro()%>"><br> 
                    <input class="form-control" name="txtid" value="<%=id%>"><br> 
                    <input class="btn btn-danger" type="submit" name="accion" value="Actualizar"><br> 
                    </div>
                    </div>
            
    </body>
</html>
