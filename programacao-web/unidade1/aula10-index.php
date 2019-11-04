<html>
<?php
session_start();
?>
<head>
</head>
<body>
<form method="post" action="aula10-formulario.php">
Login: <input type="text" name="login"><br/>
Senha: <input type="text" name="senha"><br/>
<input type="submit" value="Enviar"><br/>
<h5>Para efetuar o login, utilize o usuário <b>admin</b> e a senha <b>123</b></h5>
</form>

<?php
    if (isset($_SESSION['erro'])) {
        if ($_SESSION['erro'] == 1) {
            echo "<h2>Usuário ou senha incorreta.</h2)";
        }
    } elseif ($_SESSION['erro'] == 2) {
        echo "<h2>É preciso fazer login para ter acesso a área restrita.</h2>";
    } else {
        echo "Aconteceu algum erro.";
    }
?>

</body>
</html>