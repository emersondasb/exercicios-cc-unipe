<?php
$a = "Exemplo de conteúdo global";
teste();

function teste(){
    $a = "Variável local";

    echo 'variável $a num escopo global: ' . $GLOBALS["a"] . "<br/>";
    echo 'variável $a num escopo local: ' . $a . "<br/>";
}
?>