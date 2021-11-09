<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="Js/jquery-3.6.0.min.js"></script>
    <script src="Js/insertaract.js"></script>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/Styles.css">
    <title>Formulario Registro de Actividad</title>
</head>
<body>
    <!-- Parte del menú-->

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

    <!-- Fin Menú-->

    <!-- Contenido pagina principal -->
    <section class="registro">
        <form action="" method="POST">
        <h4>Formulario Registro de Actividad</h4>
        <input class="control" type="text" name="Codigo" id="Codigo" placeholder="Ingrese el codigo Novedad">
        <input class="control" type="text" name="Documento" id="Documento" placeholder="Ingrese el Documento">
        <p>Ingrese fecha de Actividad</p>
        <input class="control" type="date" name="Fecha" id="actividadfecha" placeholder="Ingrese la fecha de la Actividad">
        <input class="control" type="text" name="descripcion" id="descripcion" placeholder="Ingrese la descripcion ">
         
        <input class="boton" type="button" value="Registrar">
        </form>
            
    </section>
    
</body>
</html>
