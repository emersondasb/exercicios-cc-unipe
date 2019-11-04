<?php

session_start();

if(isset($_SESSION['usuarioSessao'])){
    if($_POST['usuario'] == $_SESSION['usuarioSessao'] && $_POST['senha'] == $_SESSION['senhaSessao']){
        header('location: paineldecontrole.php');
    } else {
        echo "Usuário ou senha incorreto!";
    }
} else {
    echo "Usuário e senha não definidos!";
}

?>

<html>
<a href="projeto2.php">VOLTAR</a>
</html>