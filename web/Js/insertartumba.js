$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Codigo').val();
        let codem=$('#Documento').val();
        let ubi=$('#ubicacion').val();
        
        alert("Codigo "+cod+" Codigo Empleado "+codem);
        
        $.ajax({
            
            type:"POST",
            url:"ServletTumba",
            data:{c:cod,ce:codem,u:ubi},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});