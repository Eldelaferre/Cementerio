$(document).ready(function () {
    
    consultar();
    $('.btninsF').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codf=$('#codf').val();
        let codt=$('#codt').val();
        let nomf=$('#nomf').val();
        let fecn=$('#fecn').val();
        let fecm=$('#fecm').val();
        let fech=$('#fech').val();
        let resp=$('#resp').val();
        let cor=$('#cor').val();
        let tel=$('#tel').val();
         
        

        $.ajax({
            type:"POST",
            url:"ServletFallecido",
            data:{cf:codf,ct:codt,nf:nomf,fn:fecn,fm:fecm,fh:fech,r:resp,c:cor,t:tel},
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
            url:"ServletFallecidoc",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#tab');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo Fallecido</th>  
                                        <th>Codigo Tumba</th>
                                        <th>nombre</th>
                                        <th>Fecha nacimiento</th>
                                        <th>Fecha de muerte</th>
                                        <th>Hora de muerte</th>
                                        <th>Nombre responsable</th>
                                        <th>Correo</th>
                                        <th>Telefono </th>
                                    </tr></thead> `;
                for(let i of res){
                    tabla.innerHTML+=`<tr><td><input type="text" name="doc"  id="codf" value=" ${i.codfallecido}"></td>
                                    <td><input type="text" name="usu"  id="codt" value=" ${i.codtumba}"></td>
                                    <td><input type="text" name="cla"  id="nomf" value=" ${i.nomfalle}"></td>
                                    <td><input type="text" name="rol"  id="fecn" value="${i.fecnaci}"></td>
                                    <td><input type="text" name="est"  id="fecm" value="${i.fecmuerte}"></td>
                                    <td><input type="text" name="img"  id="fech" value="${i.fechora}"></td>
                                    <td><input type="text" name="img"  id="resp" value="${i.responsable}"></td>
                                    <td><input type="text" name="img"  id="cor" value="${i.correo}"></td>
                                    <td><input type="text" name="img"  id="tel" value="${i.tel}"></td>
                                    
                                    </tr>`;
                }                    
            }
        
        });
    }

   
});


