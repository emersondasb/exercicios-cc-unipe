<?php
    $conexao = mysqli_connect("localhost", "root", "");
    mysqli_select_db($conexao, "meubd");
    mysqli_query($conexao, "
        CREATE TABLE pessoas (
            id int,
            nome varchar(255))
    ");
    mysqli_close($conexao);
?>