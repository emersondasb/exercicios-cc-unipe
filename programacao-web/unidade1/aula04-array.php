<?php

    // Array numérico:
    $carros = array("Fusca", "Gol", "Uno");

    // Para atribuir índices manualmente:
    $carros[0] = "Fusca";
    $carros[1] = "Gol";
    $carros[2] = "Uno";

    echo $carros[0]. " e ". $carros[1]." são carros populares.\n";

    // Array associativo:
    $idades = array("Maria"=>13, "Aline"=>30);

    // Forma manual:
    $idades['Maria'] = "13";
    $idades['Aline'] = "30";
    $idades['Renata'] = "25";

    echo "Aline tem " . $idades['Aline'] . " anos.";

    // Array multidimencional:

    $times = array(
        "PB" => array("Botafogo-PB", "Treze"),
        "PE" => array("Sport", "Central"),
        "SP" => array("Santos", "Palmeiras")
    );

    echo "\n" . $times["PB"][1];

    $numeros = array(5, 6, 8, 16, 32);
    echo "\n" . $numeros[2] + $numeros[4];

?>