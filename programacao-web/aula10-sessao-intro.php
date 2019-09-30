<?php

    session_start();

    $_SESSION['nome' = "Mestre dos Magos"];
    $_SESSION['codigo'] = 1;

    //excluir uma variável sessão

    unset($_SESSION['nome']);

    //para excluir todas as variáveis de uma sessão

    session_destroy();
?>