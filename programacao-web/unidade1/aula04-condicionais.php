<?php
    // Estrutura if / elseif / else
    $d = -2;

    if ($d < 0) {
        echo "Menor que zero.\n";
    }
    elseif ($d > 0) {
        echo "Maior que zero.\n";
    }
    else {
        echo "Igual a zero.\n";
    }

    // Estrutura switch

    $x = 0;

    switch ($x) {
        case 1:
            echo "Número 1\n";
            break;
        case 2:
            echo "Número 2\n";
        default:
            echo "Valor não cadastrado.\n";
            break;
    }

    // Exercício 1

    $num = -5;

    if ($num > 0) {
        echo "Positivo.\n";
    }
    else {
        echo "Negativo.\n";
    }
?>
