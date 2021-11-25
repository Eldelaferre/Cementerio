$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    
    let formulario=document.getElementById('frm');
formulario.addEventListener('submit', function (e){
    alert("formulario");
    e.preventDefault();
        console.log("actualizar imagen");
        let data=new FormData(formulario);
        data.append('op', 'ins');
        console.log(data);
        console.log(data.get('op'));
        console.log(data.get('d'));
        console.log(data.get('u'));
        console.log(data.get('i'));
        fetch('Servletinsertar',{
            method: 'POST',
            body: data
    })
    .then (datos=>datos.json())
    .then (datos=>{
        console.log(datos);
        if(datos.length>0){
            consultar();
            alert("imagen se actualiza de manera correcta");
        }
        else{
            alert("su imagen no puede ser actualizada");
        }
    })
            .catch (function (){
                alert("No hay conexion");
    });
    });
    
    //$('.boton btn_ingreso_Usuario').on('click',function(){
        
        //insertar();
        
    //});
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });
    
    //function insertar(){
    //    alert("en insertar")
    //    let doc=$('#doc').val();
    //    let rol=$('#rol').val();
    //    let usu=$('#usu').val();
    //    let cla=$('#cla').val();

        
    //    alert("Documento "+doc+" Rol "+rol);
        
    //    $.ajax({
            
    //        type:"POST",
    //        url:"Servlet_Usuario",
    //        data:{dato:"insertar",d:doc,r:rol,u:usu,c:cla},
    //            success:function(res){
    //                if(res){
    //                    alert("datos guardados");
    //                    consultar();
    //                }
    //            }
    //    });
    //}
    

    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servlet_Usuario",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Documento</th>
                                        <th>Rol</th>
                                        <th>Usuario</th>
                                        <th>Clave</th>
                                        <th>Imagen</th>
                                        <th>Accion</th>
                                    </tr></thead>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tbody><tr>  <td><input class="cod" type="text" name="Documento" id="Documento" value="${i.Codigo_Usuario}"></td>
                                                <td><input class="doc" type="text" name="rol" id="rol" value="${i.Rol_Usuario}"></td>
                                                <td><input class="doc" type="text" name="Usuario" id="Usuario" value="${i.User_Usuario}"></td>
                                                <td><input class="des" type="text" name="Clave" id="Clave" value="${i.Clave_Usuario}"></td>
                                                <td><img src="${i.Imagen_Usuario()}" width="60" height="60"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr></tbody>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let doc=$('#doc').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();

        
        alert("Documento "+doc+" Rol "+rol);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Usuario",
            data:{dato:"actualizar",d:doc,r:rol,u:usu,c:cla},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});