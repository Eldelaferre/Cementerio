$(document).ready(function () {

    consultar();
    $('.btn_ingreso_Usuario').on('click', function () {
        Insertar();
    });
    

    function Insertar() {
        let doc = $('#doc').val();
        let rol = $('#rol').val();
        let usu = $('#usu').val();
        let cla = $('#cla').val();

        $.ajax({
            type: "post",
            url: "Servlet_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");
                    consultar();
                }
            }
        });

    }
    ;

    function consultar() {
        alert("En consultar");

        $.ajax({
            type: "post",
            url: "Servlet_Consultar_Usuario",
            dataType: 'json',
            success: function (res) {
                console.log(res);
                let tabla = document.querySelector("#tablita");
                tabla.innerHTML = '';
                tabla.innerHTML = `<tr>
                    <th>Documento</th>
                    <th>Rol</th>
                    <th>Usuario</th>                  
                    <th>Clave</th>
                </tr> `;
                for (let i of res) {

                    tabla.innerHTML += `<tr>
                        <td><input class="control doc" id="doc" type="text" name="Documento" id="Documento" value="${i.Codigo_Usuario}"readonly></td>
                        <td><input type="text" class="control rol" id="rol" value="${i.Rol_Usuario}"></td>
                        <td><input class="control usu" id="usu" type="text" name="usuario" id="usuario" value="${i.User_Usuario}"></td>
                        <td><input class="control cla" id="cla" type="password" name="Nombres" id="nombres" value="${i.Clave_Usuario}"></td>
                        <td><input type="button" name="btn_Actualizar_Usuario" class="btn_Actualizar_Usuario" id="btn_Actualizar_Usuario" value="Actualizar"></td>
                        <input type="button" name="btn_Actualizar_Usuario" class="btn_Actualizar_Usuario" id="btn_Actualizar_Usuario" value="Actualizar">

                    </tr>`;
                }
            }
        });

    }
    ;

    function Actualizar() {
        alert("En Actualizar");

        let doc = $('#doc').val();
        let rol = $('#rol').val();
        let usu = $('#usu').val();
        let cla = $('#cla').val();

        $.ajax({
            type: "get",
            url: "Servlet_Actualizar_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");
                    consultar();
                }
            }
        });

    }
    ;


});