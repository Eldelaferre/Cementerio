$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#codigo').val();
        let codvi=$('#Codigov').val();
        let fec=$('#fecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Codigo visitante "+codvi);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcomentarios",
            data:{c:cod,cv:codvi,f:fec,d:des},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});


