<?php

    $arquivo = fopen('meuarquivo.txt', 'r');

    if($arquivo == false) die('Não foi possível abrir o arquivo.');
    
    while(true){
        $linha  = fgets($arquivo);
        if($linha==null) break;
        echo $linha . "<br>";
    }

    fclose($arquivo);

?>