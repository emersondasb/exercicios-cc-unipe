<?php

$conexao = new PDO('mysql:host=localhost;dbname=meubanco', 'root', '');

$nome = $_POST['nome'];
$preco = $_POST['preco'];
$quantidade = $_POST['quantidade'];

$conexao->exec("INSERT INTO produto (nome, preco, quantidade) VALUES ('$nome', '$preco', '$quantidade')");
header('location: paineldecontrole.php');


?>