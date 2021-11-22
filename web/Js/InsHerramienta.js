$(document).ready(function () {
    

    consultar();

    $('.btninsH').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codh=$('#codh').val();
        let codt=$('#codt').val();
        let nomh=$('#nomh').val();
        let marh=$('#marh').val();
        let ph=$('#ph').val();
        let eh=$('#eh').val();
        let pro=$('#pro').val();
         
        

        $.ajax({
            type:"POST",
            url:"ServletHerramienta",
            data:{ch:codh,ct:codt,nh:nomh,mh:marh,ph:ph,eh:eh,p:pro},
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
            url:"ServletHerramientac",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#tab');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo herramienta</th>  
                                        <th>Codigo trabajador</th>
                                        <th>Nombre herramienta</th>
                                        <th>Marca herramienta</th>
                                        <th>Precio herramienta</th>
                                        <th>Existencia herramienta</th>
                                        <th>Proveedor herramienta</th>
                                    </tr></thead>`;
                for(let i of res){
                    tabla.innerHTML+=`<tbody><tr><td><input type="text" name="doc"  id="codh" value=" ${i.codherramineta}"></td>
                                    <td><input type="text" name="usu"  id="codt" value=" ${i.codtrabajador}"></td>
                                    <td><input type="text" name="cla"  id="nomh" value=" ${i.nomherr}"></td>
                                    <td><input type="text" name="rol"  id="marh" value="${i.marherr}"></td>
                                    <td><input type="text" name="est"  id="ph" value="${i.precioherr}"></td>
                                    <td><input type="text" name="img"  id="eh" value="${i.exisherr}"></td>
                                    <td><input type="text" name="img"  id="pro" value="${i.proveedor}"></td>
                                    
                                    </tr></tbody>`;
                }                    
            }
        
        });
    }


   
});


