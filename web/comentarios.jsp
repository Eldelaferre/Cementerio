<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="/css/Styles.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Fromulario Registro Comentario</title>
</head>
<body>
    <!-- Parte del men�-->

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
                    <li><a href="Nosotros.jsp">Nosotros</a></li>
                    <li><a href="">Servicios</a></li>
                    <li><a href="">Aliados</a></li>
                    <li><a href="">Contacto</a></li>
                    <li><a href="Login.jsp">Ingreso</a></li>
                </ul>
            </nav>
        </section>
    </header>

    <!-- Fin Men�-->
    <section class="registro">
        <h4>Fromulario Registro Comentario</h4>
        <input class="control" type="text" name="codigo" id="codigo" placeholder="Ingrese el codigo">
        <input class="control" type="text" name="Codigov" id="Codigov" placeholder="Ingrese el codigo visitante">
        <p>Fecha del comentario</p>
        <input class="control" type="date" name="fecha" id="fecha" placeholder="Ingrese la fecha del Comentario">
        <input class="control" type="text" name="descripcion" id="descripcion" placeholder="Ingrese el comentario">
        
        <input class="boton" type="submit" value="Registrar">

    </section>
    
</body>
</html>
