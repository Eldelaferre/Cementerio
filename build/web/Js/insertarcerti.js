$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Codigo').val();
        let numco=$('#numero').val();
        let mot=$('#motivo').val();
        
        alert("Codigo "+cod+" Numero de contrato "+numco);
        
        $.ajax({
            
            type:"POST",
            url:"Servletcertificacion",
            data:{c:cod,nc:numco,m:mot},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});