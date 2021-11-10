$(document).ready(function (){
    
    consultar();
    
    $('.btn_ingreso_Usuario').on('click', function (){
       Insertar(); 
    });
    $('.').on('click', function (){
        Actualizar(); 
    });
    
    function Insertar(){
        let doc=$('#doc').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();
        
        $.ajax({
            type: "post",
            url: "Servlet_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res){
                    alert("Datos Guardados");
                    consultar();
                }
            }
        });
        
    };
    
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
                        <td>${i.Codigo_Usuario}</td>
                        <td>${i.Rol_Usuario}</td>
                        <td>${i.User_Usuario}</td>
                        <td>${i.Clave_Usuario}</td>

                    </tr>`;
                }
            }
        });

    };
    
    function Actualizar(){
        let doc=$('#doc').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();
        
        $.ajax({
            type: "post",
            url: "Servlet_Actualizar_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res){
                    alert("Datos Guardados");
                    consultar();
                }
            }
        });
        
    };
    
    
});