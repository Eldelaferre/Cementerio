$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
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
            data:{c:cod,d:doc,a:act,de:des},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});

