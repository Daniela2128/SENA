
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO DE APRENDICES</h1>
        <div class="container">
            <div class="col-lg-6">
                <form action="ControladorAprendiz">
                   Documento del aprendiz:<br>
                    <input class="form-control" type="number" name="txtdocu"><br> 
                    Nombre del aprendiz:<br>
                    <input class="form-control" type="text" name="txtnombreap"><br> 
                    Apellido del aprendiz:<br>
                    <input class="form-control" type="text" name="txtapellidoap"><br> 
                    Correo del aprendiz:<br>
                    <input class="form-control" type="email" name="txtcorreoap"><br> 
                    Numero del aprendiz:<br>
                    <input class="form-control" type="number" name="txtteleap"><br> 
                    <input class="btn btn-danger" type="submit" name="accion" value="Agregar"><br> 
                </form>
            </div>
        </div>
    </body>
</html>

