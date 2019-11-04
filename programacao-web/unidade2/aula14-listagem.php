<?php
    $conn = new PDO('mysql:host=localhost;dbname=meubd', 'root', '');

    $result = $conn->query("SELECT id, nome FROM famosos");

    if($result)
        foreach($result as $row)
            echo $row['id'] . ' - ' . $row['nome'] . '<br>';

    $conn->exec("DELETE FROM famosos WHERE id = 2");

    $conn = null;
?>