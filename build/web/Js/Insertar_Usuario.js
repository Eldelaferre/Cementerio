$(document).ready(function (){
    
    alert("en el jsp")
    
    $('#btn_ingreso_Usuario').on('click', function (){
        alert("en el jsp");
        Insertar(); 
    });
    
    function Insertar(){
        alert("en insertar");
        let doc=$('#doc').val();
        let rol=$('#rol').val();
        let usu=$('#usu').val();
        let cla=$('#cla').val();
        
         alert("Documento "+doc+" Rol "+rol);
         
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