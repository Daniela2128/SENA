<%-- 
    Document   : listadoficha
    Created on : 19/05/2023, 6:48:42 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Ficha"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.FichaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
    <body>
   <div class="container">
            <h1>FICHAS REGISTRADAS EN EL SISTEMA</h1>
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Codigo Ficha</th>
                        <th class="text-center">Cantidad Aprendices</th>
                        <th class="text-center">Codigo Programa</th>
                        <th class="text-center">Codigo Aprendiz</th>
                      
                                                                     
                    </tr>
                    
                </thead>
                
                <% 
                FichaDao fdao=new FichaDao();
                List<Ficha>Listar=fdao.listadoficha();
                Iterator<Ficha>it=Listar.iterator();
                Ficha usu=null;
                while(it.hasNext()){
                    usu=it.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getId()%></td>
                        <td class="text-center"><%=usu.getCodficha()%></td>
                        <td class="text-center"><%=usu.getCantapre()%></td>
                        <td class="text-center"><%=usu.getCodprod()%></td>
                        <td class="text-center"><%=usu.getCodaprendiz()%></td>

                        
                        <td class="text-center">
                           <a class="btn btn-warning" href="../ControladorFicha?accion=editar&id=<%=usu.getId()%>">Editar</a>
                            <a class="btn btn-warning" href="../ControladorFicha?accion=eliminar&id=<%=usu.getId()%>">Eliminar</a>
                            
                        </td>
                        
                    </tr>
                    <%}%>
                </tbody>
                
                
            </table>
            
        </div>
        
    </body>
</html>
