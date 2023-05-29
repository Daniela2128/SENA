<%-- 
    Document   : listadopro
    Created on : 4/05/2023, 6:59:33 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Lista</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>PROGRAMAS REGISTRADOS EN EL SISTEMA</h1>
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Codigo Programa</th>
                        <th class="text-center">Nombre Programa</th>
                        
                        
                        
                    </tr>
                    
                </thead>
                
                <% 
                ProgramaDao prodao=new ProgramaDao();
                List<Programa>Listar=prodao.listadopro();
                Iterator<Programa>it=Listar.iterator();
                Programa usu=null;
                while(it.hasNext()){
                    usu=it.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getid()%></td>
                        <td class="text-center"><%=usu.getCodprograma()%></td>
                        <td class="text-center"><%=usu.getnombrepro()%></td>
                        
                        
                        <td class="text-center">
                           <a class="btn btn-warning" href="ControladorPrograma?accion=editar&id=<%=usu.getid()%>">Editar</a>
                           <a class="btn btn-warning" href="ControladorPrograma?accion=eliminar&id=<%=usu.getid()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%}%>
                </tbody>
                
                
            </table>
            
        </div>
        
    </body>
</html>
