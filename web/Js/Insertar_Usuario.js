$(document).ready(function (){
    
    $('.btn_ingreso_Usuario').on('click', function (){
       Insertar(); 
    });
    
    function Insertar(){
        let doc=$('#doc').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();
        
        $.ajax({
            type: "post",
            url: "Servlet_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res){
                    alert("Datos Guardados");
                }
            }
        });
        
    };
    
});