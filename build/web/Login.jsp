<%-- 
    Document   : Login
    Created on : 2/11/2021, 10:42:39 PM
    Author     : maico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/Registro.css">
        <link rel="stylesheet" href="css/Styles.css">
        <title>Login</title>
    </head>
    <body>
        <header>
        <section>
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
                    <li><a href="Nosotros.html">Nosotros</a></li>
                    <li><a href="">Servicios</a></li>
                    <li><a href="">Aliados</a></li>
                    <li><a href="">Contacto</a></li>
                    <li><a href="Login.html">Ingreso</a></li>
                </ul>
            </nav>
        </section>
    </header>
        <section class="sec_log_uno">
        <form action="" method="POST" id="form">
            <div class="from">
                <h1>Ingreso</h1>
                <div class="grupo">
                    <input type="text" name="" id="name" required><span class="barra"></span>
                    <label class="label" for="">Nombre</label>
                    
                </div>
                <div class="grupo">
                    <input type="email" name="" id="name" required><span class="barra"></span>
                    <label class="label" for="">Email</label>
                    
                </div>
                <div class="grupo">
                    <input type="password" name="" id="name" required><span class="barra"></span>
                    <label class="label" for="">Contraseña</label>
                    
                </div>
    
                <button type="submit">Ingresar</button>

                <a class="visitante" href="Usuario.html">No tengo cuenta, ir a Registro</a>
            </div>
    
    
        </form>
    </section>
    </body>
</html>
