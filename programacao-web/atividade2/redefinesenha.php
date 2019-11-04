<?php

session_start();

if(isset($_SESSION['usuarioSessao']) && isset($_SESSION['senhaSessao']))
{
    echo "<b>O usuário atual é:</b> " . $_SESSION['usuarioSessao'] . "<br/>";
    echo "<b>A senha atual é:</b> " . $_SESSION['senhaSessao'] . "<br/>";
} else {
    echo "Não há usuário e senha cadastrados." . "<br/>";
}


?>

<html>

<body>
    <br />
    <form action="validacadastro.php" method="POST" onsubmit="return senhaConfirma()">
        Novo usuário: <input type="text" name="usuario" required /><br />
        Nova senha: <input type="password" id="senha" required /><br />
        Redigite a nova senha: <input type="password" id="senhaRepete" name="senha" required /><br />
        <input type="submit" value="Enviar" />
    </form>


    <script>
        function senhaConfirma() {
            var senhaDigitada = document.getElementById('senha').value;
            var confirmaSenha = document.getElementById('senhaRepete').value;

            if (senhaDigitada != confirmaSenha) {
                alert("As senhas digitadas não coincidem. Digite novamente!");
                return false;
            } else {
                alert("Informações atualizadas com sucesso!");
            }
        }
    </script>

</body>

</html>