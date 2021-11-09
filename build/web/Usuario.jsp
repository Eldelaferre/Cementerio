<%-- 
    Document   : Usuario
    Created on : 2/11/2021, 10:40:06 PM
    Author     : stild
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/Styles.css">
    <title>Fromulario Registro Usuario</title>
</head>
<body>
    <!-- Parte del menú-->

    <header>
        <section class="sec_menu">
            <a href="index.jsp" id="Logo">Cementerios</a>

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

    <!-- Fin Menú-->

    <!-- Contenido pagina principal -->
    <section class="registro">
        <h4>Fromulario Registro Usuario</h4>
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento">
        <input class="control" type="text" name="Rol" id="Rol" placeholder="Ingrese su Rol(administrador,trabajador,visitante)">
        <input class="control" type="text" name="usuario" id="usuario" placeholder="Ingrese su Usuario">
        <input class="control" type="password" name="Nombres" id="nombres" placeholder="Ingrese su Contraseña">
        
        <input class="boton" type="submit" value="Registrar">

    </section>
    
</body>
</html>