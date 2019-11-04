<?php

    // abre o arquivo colocando o ponteiro de escrita no final
    $arquivo = fopen('meuarquivo.txt', 'a+');

    if($arquivo){
        // move o ponteiro apra o inicio do arquivo
        rewind($arquivo);

        if(!fwrite($arquivo, 'Novo conteúdo'."\n"))
            die('Não foi possível atualizar o arquivo.');

        echo 'Arquivo atualizado com sucesso.';
        fclose($arquivo);
    }

?>