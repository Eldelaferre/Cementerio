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

        <link rel="stylesheet" href="css/tablaf.css">

        <script src="Js/jquery-3.6.0.min.js"></script>
        <script src="Js/InsFallecido.js"></script>
        <title>Fromulario Registro Fallecido</title>
    </head>
    <body>
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
        <section action="" method="POST" class="registro">
        <h4>Fromulario Registro Fallecido</h4>
        <input class="control" type="text" name="codf" id="codf" placeholder="Ingrese el codigo">
        <input class="control" type="text" name="codt" id="codt" placeholder="Ingrese el codigo de la tumba">
        <input class="control" type="text" name="nomf" id="nomf" placeholder="Ingrese el Nombre">
        <p>Fecha de nacimiento</p>
        <input class="control" type="date" name="Fecha" id="fecn" placeholder="Ingrese la fecha de nacimiento">
        <p>Ingrese fecha de muerte</p>
        <input class="control" type="date" name="Fecha" id="fecm" placeholder="Ingrese la fecha de muerte">
        <p>Ingrese Hora de muerte</p>
        <input class="control" type="time" name="Hora" id="fech" placeholder="Ingrese la hora del fallecido">
        <input class="control" type="text" name="Nombresr" id="resp" placeholder="Ingrese el Nombre del responsable">

        <input class="control" type="email" name="correo" id="cor" placeholder="Ingrese el correo electronico del responsable ">
        <input class="control" type="text" name="Telefono" id="tel" placeholder="Ingrese el telefono del responsable">
        <input class="btninsF" id="boton" type="submit" value="Registrar">
        

        </section>
        <form class="main-container" action="" method="POST">
            <table class="tabla" id="tab">
                
            
            </table>
        </form>
        
    </body>
</html>
