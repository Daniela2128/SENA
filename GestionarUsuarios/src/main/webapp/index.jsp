<%-- 
    Document   : index
    Created on : 24/04/2023, 7:10:49 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <link rel="stylesheet" href="style.css" type="text/css"/>

        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vista/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="datos">
            <div class="col-lg-6">
            <h1>Ingresar Datos</h1>
            <form action="ControladorAprendiz">
            Documento:<br>
            <input class="form-control" type="number" name="txtdoc"><br>
            Nombres:<br>
            <input class="form-control" type="text" name="txtNom"><br>
            Apellidos:<br>
            <input class="form-control" type="text" name="txtApe"><br>
            Correo:<br>
            <input class="form-control" type="text" name="txtCor"><br>
            Telefono:<br>
            <input class="form-control" type="number" name="txtTel">
            <br>
            <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
        </form>
        </div>
        </div>
    </body>
</html>
