<%-- 
    Document   : Fallecido
    Created on : 2/11/2021, 10:42:22 PM
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
        <title>Fromulario Registro Fallecido</title>
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
        <h4>Fromulario Registro Fallecido</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese el codigo">
        <input class="control" type="text" name="CodgioT" id="CodigoT" placeholder="Ingrese el codigo de la tumba">
        <input class="control" type="text" name="Nombres" id="Nombre" placeholder="Ingrese el Nombre">
        <p>Fecha de nacimiento</p>
        <input class="control" type="date" name="Fecha" id="Fechanacimiento" placeholder="Ingrese la fecha de nacimiento">
        <p>Ingrese fecha de muerte</p>
        <input class="control" type="date" name="Fecha" id="Fechanacimiento" placeholder="Ingrese la fecha de muerte">
        <p>Ingrese Hora de muerte</p>
        <input class="control" type="time" name="Hora" id="hora" placeholder="Ingrese la hora del fallecido">
        <input class="control" type="text" name="Nombresr" id="Nombresr" placeholder="Ingrese el Nombre del responsable">

        <input class="control" type="email" name="correo" id="correo" placeholder="Ingrese el correo electronico del responsable ">
        <input class="control" type="text" name="Telefono" id="telefono" placeholder="Ingrese el telefono del responsable">
        <input class="boton" type="submit" value="Registrar">
        

        </section>
    </body>
</html>
