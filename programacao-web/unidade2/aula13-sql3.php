<?php
$conexao= mysqli_connect("localhost", "root", "");
mysqli_select_db($conexao, "meubd"); 
mysqli_query($conexao, "
    INSERT INTO pessoas 
    (nome) 
    VALUES
    ('Jose')
    "); 

?>