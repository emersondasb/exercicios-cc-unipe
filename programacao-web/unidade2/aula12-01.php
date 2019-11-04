<?php

    $arquivo = fopen('meuarquivo.txt', 'w');

    if($arquivo == false) {
        die('Não foi possível criar o arquivo');
    }
    else {
        echo 'arquivo criado com sucesso';
    }

?>