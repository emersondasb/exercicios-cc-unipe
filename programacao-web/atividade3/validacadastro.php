<?php

$conexao = new PDO('mysql:host=localhost;dbname=meubanco', 'root', '');

$nome = $_POST['nome'];
$email = $_POST['email'];
$senha = md5($_POST['senha']);

$consulta = "SELECT * FROM usuario WHERE email = '$email'";

$query = $conexao->prepare($consulta);
$query->execute();
$usuario = $query->fetchObject();

if ($usuario) {
    echo "O e-mail informado já se encontra cadastrado.";
    
} else {
    $inserir = $conexao->exec("INSERT INTO usuario (nome, email, senha) VALUES ('$nome', '$email', '$senha')");
    header('location: login.html');
}

?>
<br>
<a href="login.html">VOLTAR</a>