<?php
    $nome = $_POST['nome'];
    $nascimento = $_POST['nascimento'];
    $email = $_POST['email'];

    echo "<br/>CADASTRO REALIZADO COM SUCESSO!";
    echo "<br/><br/>Nome do usuário: " .$nome;
    echo "<br/>Data de nascimento: " .$nascimento;
    echo "<br/>E-mail: " .$email;
?>