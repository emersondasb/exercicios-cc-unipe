<?php

$conexao = new PDO('mysql:host=localhost;dbname=meubanco', 'root', '');

$email = $_POST['email'];
$senha = md5($_POST['senha']);
$sql = "SELECT * FROM usuario WHERE email = '$email'";

$consulta = $conexao->prepare($sql);
$consulta->execute();
$usuario = $consulta->fetchObject();

if ($usuario && $usuario->senha === $senha){
      header('location: paineldecontrole.php');
      session_start();
      $_SESSION['logado'] = 1;
} else {
      echo "Dados inseridos inválidos. Digitou e-mail e senha corretamente?";
}

?>

<html>
<br>
<a href="novousuario.html">Novo usuário</a><br>
<a href="login.html">VOLTAR</a>
</html>