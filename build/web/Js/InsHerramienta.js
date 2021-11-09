$(document).ready(function () {
    
    
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

   
});