$(document).ready(function () {
    

    consultar();

    $('.btninsN').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codn=$('#codn').val();
        let code=$('#code').val();
        let fecn=$('#fecn').val();
        let desc=$('#desc').val();
        let estn=$('#estn').val();
        
         
       

        $.ajax({
            type:"POST",
            url:"ServletNovedad",
            data:{cn:codn,ce:code,fn:fecn,dc:desc,en:estn},
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
            url:"ServletNovedadc",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#tab');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<tr><th>Codigo Novedad</th>  
                                        <th>Codigo empleado</th>
                                        <th>Fecha Novedad</th>
                                        <th>Descripcion Novedad</th>
                                        <th>Estado Novedad</th>
                                        
                                    </tr> `;
                for(let i of res){
                    tabla.innerHTML+=`<tr><td><input type="text" name="doc"  id="codn" value=" ${i.codnove}"></td>
                                    <td><input type="text" name="usu"  id="code" value=" ${i.codemple}"></td>
                                    <td><input type="text" name="cla"  id="fecn" value=" ${i.fecnove}"></td>
                                    <td><input type="text" name="rol"  id="desc" value="${i.descrinove}"></td>
                                    <td><input type="text" name="est"  id="estn" value="${i.estnove}"></td>
                                    
                                    
                                    </tr>`;
                }                    
            }
        
        });
    }


   
});


