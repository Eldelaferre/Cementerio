$(document).ready(function(){
    
    $('.boton').on('click',function(){
        
        insertar();
        
    });
    
    function insertar(){
        alert("en insertar")
        let cod=$('#Documento').val();
        let tip=$('#tipo').val();
        let nom=$('#Nombre').val();
        let dir=$('#Direccion').val();
        let tel=$('#Telefono').val();
        let cor=$('#correo').val();
        
        alert("Codigo "+cod+" Tipo "+tip);
        
        $.ajax({
            
            type:"POST",
            url:"Servletempleado",
            data:{c:cod,t:tip,n:nom,d:dir,te:tel,e:cor},
                success:function(res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        });
    }
    
});