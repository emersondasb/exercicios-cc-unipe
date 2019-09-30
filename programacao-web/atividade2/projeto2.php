<html>
<form action="paineldecontrole.php">
Nome: <input type="text" name="nome" required/><br/>
Senha: <input type="password" name="senha" required/><br/>
<input type="submit" value="Enviar"/><br/>
<a href="novousuario.html">Novo usuário</a><br/>
<a href="redefinesenha.php">Esqueceu sua senha?</a><br/>
</form>
</html>

<?php
session_start();

if (isset($_POST['usuario']) && $_POST['senha']){
    $_SESSION['usuarioSessao'] = $_POST['usuario'];
    $_SESSION['senhaSessao'] = $_POST['senha'];
} else {
    echo "Usuário e senha não ainda foram definidos.<br/>";
}
?>