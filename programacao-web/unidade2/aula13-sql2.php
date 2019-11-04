<?php
    $conexao = mysqli_connect("localhost", "root", "");
    mysqli_select_db($conexao, "meubd");
    mysqli_query($conexao, "
    CREATE TABLE pessoas (
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    nome varchar(255),
    PRIMARY KEY (id))
    ");
?>