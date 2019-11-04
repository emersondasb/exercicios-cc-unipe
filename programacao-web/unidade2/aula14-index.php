<?php
    $conn = new PDO('mysql:host=localhost; port=3306;
    dbname=meubd', 'root', '');

    $conn->exec("INSERT INTO famosos(nome)
    VALUES('Super Mario')");
?>