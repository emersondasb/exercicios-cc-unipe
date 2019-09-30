<html>
    <head>
        <meta charset="utf-8"/>
        <meta http-equiv="content-type"/>
    </head>
    <body>
        <form action="valida.php" method="POST">
            Nome do usuário: <input type="text" name="nome"/><br/>
            Data de nascimento: <input type="date" name="nascimento"/><br/>
            E-mail: <input type="email" name="email" id="email" /><br/>
            Confirmação de e-mail: <input type="email" id="confirmacaoEmail" onchange="emailConfirma()" /><br/>
            <input type="submit" value="Enviar">
        </form>

        <script>
            function emailConfirma(){
                var emailDigitado = document.getElementById('email').value;
                var confirmaEmail = document.getElementById('confirmacaoEmail').value;
            
                if (emailDigitado != confirmaEmail){
                    alert("Os e-mails digitados não coincidem. Digite novamente!");
            }
            }
        </script>
    </body>
</html>