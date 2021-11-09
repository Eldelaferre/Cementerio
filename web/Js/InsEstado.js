$(document).ready(function () {
    
    
    $('.btninsE').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let ces=$('#ces').val();
        let cfal=$('#cfal').val();
        let fecr=$('#fecr').val();
        let horr=$('#horr').val();
        let tipo=$('#tipo').val();
        
         
        

        $.ajax({
            type:"POST",
            url:"ServletEstado",
            data:{ce:ces,cf:cfal,fr:fecr,hr:horr,t:tipo},
                success:function (res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        
        });
    }

   
});