<?php
session_start();

if (isset($_POST['usuario']) && $_POST['senha']){
    $_SESSION['usuarioSessao'] = $_POST['usuario'];
    $_SESSION['senhaSessao'] = $_POST['senha'];
} else {
    echo "Usuário e senha não foram definidos!";
}

header('Location: projeto2.php');
?>