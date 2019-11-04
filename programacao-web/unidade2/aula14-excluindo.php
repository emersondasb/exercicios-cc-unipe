<?php
    
    $conn = new PDO('mysql:host=localhost;dbname=meubd', 'root', '');
    
    $conn->exec("DELETE FROM famosos WHERE id = 2");

    $conn = null;
?>