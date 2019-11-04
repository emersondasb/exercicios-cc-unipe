<?php

    $arquivo = fopen('meuarquivo.txt', 'w+');

    if($arquivo){
        if(!fwrite($arquivo, 'Novo conteúdo'))
            die('Não foi possível atualizar o arquivo.');
    
    echo 'Arquivo atualizado com sucesso';
    fclose($arquivo);}
    

?>