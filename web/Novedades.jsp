

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <title>Fromulario Registro Novedad</title>
    </head>
    <body>
        <header>
        <section class="sec_menu">
            <a href="index.html" id="Logo">Cementerios</a>

            <label for="menu-1" class="menu">
                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>

                </ul>
            </label>
            <input type="checkbox" id="menu-1">

            <nav>
                <ul>
                    <li><a href="#sec2">Nosotros</a></li>
                    <li><a href="#sec3">Servicios</a></li>
                    <li><a href="#sec4">Aliados</a></li>
                    <li><a href="">Contacto</a></li>
                    <li><a href="Login.jsp">Ingreso</a></li>
                </ul>
            </nav>
        </section>
        </header>
        <section class="registro">
        <h4>Fromulario Registro Novedad</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese el codigo Novedad">
        <input class="control" type="text" name="Documento" id="
        Documento" placeholder="Ingrese el Documento">
        <p>Ingrese la fecha de la novedad</p>
        <input class="control" type="date" name="Fecha" id="novedadfecha" placeholder="Ingrese la fecha de la Novedad">
        <input class="control" type="text" name="descripcion" id="descripcion" placeholder="Ingrese la descripcion ">
        <input class="control" type="text" name="estado" id="estado" placeholder="Ingrese el estado de la novedad">
         
        <input class="boton" type="submit" value="Registrar">
            
        </section>
    </body>
</html>
