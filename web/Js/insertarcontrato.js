$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Codigo').val();
        let codem=$('#Documento').val();
        let tipagco=$('#TIPO').val();
        let despagco=$('#descripcion').val();
        let canpagco=$('#cantidad').val();
        let sala=$('#salario').val();
        let fecini=$('#Fechainicial').val();
        let fecfin=$('#Fechafinal').val();
        let tipcontra=$('#tipocontrato').val();
        let cargo=$('#cargo').val();
        
        alert("Codigo "+cod+" Documento "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcontrato",
            data:{c:cod,ec:codem,tpc:tipagco,dpc:despagco,ca:canpagco,s:sala,fic:fecini,ffc:fecfin,tc:tipcontra,cc:cargo},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});