$(document).ready(function () {
    
    
    $('.btninsF').on('click',function(){
        
        insertar();
        
    });

    function insertar (){
        alert("en insertar");
        let codf=$('#codf').val();
        let codt=$('#codt').val();
        let nomf=$('#nomf').val();
        let fecn=$('#fecn').val();
        let fecm=$('#fecm').val();
        let fech=$('#fech').val();
        let resp=$('#resp').val();
        let cor=$('#cor').val();
        let tel=$('#tel').val();
         
        

        $.ajax({
            type:"POST",
            url:"ServletFallecido",
            data:{cf:codf,ct:codt,nf:nomf,fn:fecn,fm:fecm,fh:fech,r:resp,c:cor,t:tel},
                success:function (res){
                    if(res){
                        alert("datos guardados")
                    }
                }
        
        });
    }

   
});


