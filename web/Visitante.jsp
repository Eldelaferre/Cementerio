<%-- 
    Document   : Visitante
    Created on : 2/11/2021, 10:39:36 PM
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
    <link rel="stylesheet" href="/css/Styles.css">
    
    <title>Fromulario Registro visitante</title>
</head>
<body>
    <!-- Parte del menú-->

    <header>
        <section>
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
                    <li><a href="Nosotros.html">Nosotros</a></li>
                    <li><a href="">Servicios</a></li>
                    <li><a href="">Aliados</a></li>
                    <li><a href="">Contacto</a></li>
                    <li><a href="Login.html">Ingreso</a></li>
                </ul>
            </nav>
        </section>
    </header>

    <!-- Fin Menú-->
    <section class="registro">
        <h4>Fromulario Registro Visitante</h4>
        <input class="control" type="text" name="codigo" id="codigo" placeholder="Ingrese el codigo">
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento">
        <input class="control" type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre">
        <input class="control" type="text" name="Direccion" id="Direccion" placeholder="Ingrese la Direccion">
        <input class="control" type="text" name="telefono" id="telefono" placeholder="Ingrese el telefono">
        <input class="control" type="email" name="correo" id="correo" placeholder="Ingrese el correo">
        
        
        <input class="boton" type="submit" value="Registrar">

    </section>
    
</body>
</html>