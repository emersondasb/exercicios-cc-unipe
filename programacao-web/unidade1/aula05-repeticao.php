<?php

    $contador = 1;
    while ($contador <= 5) {
        echo "Tem alguém com sono <br>";
        $contador++;
    }

    $contador2 = 0;
    $nomes = array("José", "Maria", "Carlos");

    while($contador2 < 3) {
        echo $nomes[$contador2] . "<br>";
        $contador2++;
    }

    $contador3 = 0;

    do {
        echo "Boa noite! <br>";
        $contador3++;
    } while ($contador3 < 5);

    for($i = 1; $i <= 5; $i++) {
        echo "O número é " . $i . "<br>";
    }

    // Para saber a quantidade de elementos de um array

    echo count($nomes) . "<br>";

    for($i = 0; $i < count($nomes); $i++) {
        echo $nomes[$i] . "<br>";
    }


    // Estrutura do foreach
    foreach($nomes as $vetor) {
        echo $vetor . "<br>";
    }

?>