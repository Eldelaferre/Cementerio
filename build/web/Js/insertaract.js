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
        let cod=$('#Codigo').val();
        let doc=$('#Documento').val();
        let act=$('#actividadfecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Documento "+doc);
        
        $.ajax({
            
            type:"POST",
            url:"Servletactividad",
            data:{dato:"insertar",c:cod,d:doc,a:act,de:des},
                success:function(res){
                    if(res){
                        alert("datos guardados");
                        consultar();
                    }
                }
        });
    }
    
    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servletconsultaract",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<tr><th>Codigo</th>
                                        <th>Documento</th>
                                        <th>Fecha de activida</th>
                                        <th>Descripcion</th>
                                    </tr>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tr>  <td><input class="control" type="text" name="Codigo" id="Codigo" value="${i.codigo}"></td>
                                                <td><input class="control" type="text" name="Documento" id="Documento" value="${i.codempleado}"></td>
                                                <td><input class="control" type="text" name="Fecha" id="Fecha" value="${i.fecha}"></td>
                                                <td><input class="control" type="text" name="descripcion" id="descripcion" value="${i.descripcion}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let cod=$('#Codigo').val();
        let doc=$('#Documento').val();
        let act=$('#actividadfecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Documento "+doc);
        
        $.ajax({
            
            type:"POST",
            url:"Servletactividad",
            data:{dato:"actualizar",c:cod,d:doc,a:act,de:des},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});

