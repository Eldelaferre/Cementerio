<%-- 
    Document   : Herramientas
    Created on : 2/11/2021, 10:42:30 PM
    Author     : maico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <title>Fromulario Registro herramienta</title>
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
                    <li><a href="Login.html">Ingreso</a></li>
                </ul>
            </nav>
        </section>
        </header>
     <section class="registro">
        <h4>Fromulario Registro herramienta</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese el codigo de la herramienta">
        <input class="control" type="text" name="Documento" id="
        Documento" placeholder="Ingrese el Documento del trabajador">
        <input class="control" type="text" name="Nombres" id="Nombre" placeholder="Ingrese el Nombre de herramienta">
        <input class="control" type="text" name="marca" id="marca" placeholder="Ingrese la marca">
        <input class="control" type="text" name="precio" id="precio" placeholder="Ingrese el precio">
        <input class="control" type="text" name="existencia" id="existencia" placeholder="Ingrese la existencia">
        <input class="control" type="text" name="proveedor" id="proveedor" placeholder="Ingrese el proveedor">

        <input class="boton" type="submit" value="Registrar">
        

    </section>
    </body>
</html>
