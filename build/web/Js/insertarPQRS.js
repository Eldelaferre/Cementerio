$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Codigo').val();
        let codvi=$('#numero').val();
        let fec=$('#fecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Codigo Visitante "+codvi);
        
        $.ajax({
            
            type:"POST",
            url:"ServletPQRS",
            data:{c:cod,cv:codvi,f:fec,d:des},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});
