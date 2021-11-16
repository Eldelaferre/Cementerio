$(document).ready(function () {
    consultar();
    
    $('.btninsE').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let ces=$('#ces').val();
        let cfal=$('#cfal').val();
        let fecr=$('#fecr').val();
        let horr=$('#horr').val();
        let tipo=$('#tipo').val();
        
         
        

        $.ajax({
            type:"POST",
            url:"ServletEstado",
            data:{ce:ces,cf:cfal,fr:fecr,hr:horr,t:tipo},
                success:function (res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        
        });
    }
    function consultar(){
        alert("en consultar")
        
        $.ajax({
            type:"POST",
            url:"ServletEstadoc",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#tab');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<tr><th>Codigo</th>  
                                        <th>Codigo Fallecido</th>
                                        <th>Fecha realizada</th>
                                        <th>Hora realizada</th>
                                        <th>Tipo</th>
                                        
                                    </tr> `;
                for(let i of res){
                    tabla.innerHTML+=`<tr><td><input type="text" name="doc"  id="ces" value=" ${i.codestado}"></td>
                                    <td><input type="text" name="usu"  id="cfal" value=" ${i.codfallecido}"></td>
                                    <td><input type="text" name="cla"  id="fecr" value=" ${i.fecreal}"></td>
                                    <td><input type="text" name="rol"  id="horr" value="${i.horreal}"></td>
                                    <td><input type="text" name="est"  id="tipo" value="${i.tipo}"></td>
                                    
                                    
                                    </tr>`;
                }                    
            }
        
        });
    }

   
});


