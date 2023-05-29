<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Lista</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>APRENDICES REGISTRADOS EN EL SISTEMA</h1>
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Documento</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Numero de Contacto</th>
                        
                        
                        
                    </tr>
                    
                </thead>
                
                <% 
                AprendizDao apdao=new AprendizDao();
                List<Aprendiz>Listar=apdao.listadoape();
                Iterator<Aprendiz>it=Listar.iterator();
                Aprendiz usu=null;
                while(it.hasNext()){
                    usu=it.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getid()%></td>
                        <td class="text-center"><%=usu.getDocu()%></td>
                        <td class="text-center"><%=usu.getNombreap()%></td>
                        <td class="text-center"><%=usu.getApellidoap()%></td>
                        <td class="text-center"><%=usu.getCorreoap()%></td>
                        <td class="text-center"><%=usu.getTeleap()%></td>
                        
                        <td class="text-center">
                             <a class="btn btn-warning" href="../ControladorAprendiz?accion=editar&id=<%=usu.getid()%>">Editar</a>
                            <a class="btn btn-warning" href="../ControladorAprendiz?accion=eliminar&id=<%=usu.getid()%>">Eliminar</a>
                            
                        </td>
                        
                    </tr>
                    <%}%>
                </tbody>
                
                
            </table>
            
        </div>
        
    </body>
</html>