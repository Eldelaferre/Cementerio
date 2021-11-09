$(document).ready(function () {

    $('.btn_ingreso_Visitante').on('click', function () {
        Insertar();
    });

    function Insertar() {
        let cod = $('#cod').val();
        let doc = $('#doc').val();
        let nom = $('#nom').val();
        let dir = $('#dir').val();
        let tel = $('#tel').val();
        let cor = $('#cor').val();
        alert(nom);
        $.ajax({
            type: "post",
            url: "Servlet_Visitante",
            data: {dato: "Insertar", c: cod, d: doc, n: nom, di: dir, t: tel, co: cor},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");
                }
            }
        });

    }
    ;

});


