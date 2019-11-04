<?php
    
    // Estabelece conexão com um bando de dados
    $conexao = mysqli_connect("localhost", "root", "");

    // Testa conexão com o banco de dados
    if($conexao)
        echo "Conexao estabelecida com sucesso!" . "<br>";
    else
        echo "Erro ao estabelecer conexao" . "<br>";

    // Cria a base de dados mysql. Pode ser removido após a criação
    if(mysqli_query($conexao, "CREATE DATABASE IF NOT EXISTS meubd")){
        echo 'Banco de dados criado' . "<br>";
    } else {
        echo 'Erro criando o banco de dados' . "<br>";
    }


    
?>