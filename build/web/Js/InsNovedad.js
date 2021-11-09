$(document).ready(function () {
    
    
    $('.btninsN').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codn=$('#codn').val();
        let code=$('#code').val();
        let fecn=$('#fecn').val();
        let desc=$('#desc').val();
        let estn=$('#estn').val();
        
         
       

        $.ajax({
            type:"POST",
            url:"ServletNovedad",
            data:{cn:codn,ce:code,fn:fecn,dc:desc,en:estn},
                success:function (res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        
        });
    }

   
});


