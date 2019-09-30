<?php
    $numeros = array(2, 4, 5, 1, 9, 16);
    $soma = 0;
    for($i=0; $i < count($numeros); $i++) {
        $soma += $numeros[$i];
    }

    echo $soma;
        
?>