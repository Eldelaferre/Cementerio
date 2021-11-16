$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Documento').val();
        let tip=$('#tipo').val();
        let nom=$('#Nombre').val();
        let dir=$('#Direccion').val();
        let tel=$('#Telefono').val();
        let cor=$('#correo').val();
        
        alert("Codigo "+cod+" Tipo "+tip);
        
        $.ajax({
            
            type:"POST",
            url:"Servletempleado",
            data:{dato:"insertar",c:cod,t:tip,n:nom,d:dir,te:tel,e:cor},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servletxonsultaremp",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<tr><th>Codigo</th>
                                        <th>Tipo de empleado</th>
                                        <th>Nombre de empleado</th>
                                        <th>Direccion de empleado</th>
                                        <th>Telefono de empleado</th>
                                        <th>Correo de empleado</th>
                                    </tr>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tr>  <td><input class="control" type="text" name="Documento" id="Documento" value="${i.codigo}"></td>
                                                <td><input class="control" type="text" name="tipo" id="tipo" value="${i.tipo}"></td>
                                                <td><input class="control" type="text" name="Nombres" id="Nombres" value="${i.nombre}"></td>
                                                <td><input class="control" type="text" name="Direccion" id="Direccion" value="${i.direccion}"></td>
                                                <td><input class="control" type="text" name="Telefono" id="Telefono" value="${i.telefono}"></td>
                                                <td><input class="control" type="text" name="correo" id="correo" value="${i.email}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let cod=$('#Documento').val();
        let tip=$('#tipo').val();
        let nom=$('#Nombre').val();
        let dir=$('#Direccion').val();
        let tel=$('#Telefono').val();
        let cor=$('#correo').val();
        
        alert("Codigo "+cod+" Tipo "+tip);
        
        $.ajax({
            
            type:"POST",
            url:"Servletempleado",
            data:{dato:"actualizar",c:cod,t:tip,n:nom,d:dir,te:tel,e:cor},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});