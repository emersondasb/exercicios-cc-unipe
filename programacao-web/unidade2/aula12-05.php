<?php

    $arquivo = fopen('meuarquivo.txt', 'r');

    if($arquivo == false) die('Não foi possível abrir o arquivo.');
    else echo 'Consegui acessar o arquivo<br>';

    $linha = fgets($arquivo);

    echo $linha;

    fclose($arquivo);

?>