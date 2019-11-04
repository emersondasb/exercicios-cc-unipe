<?php
    function escreveNome_1(){
        echo "Bettlejuice" . "<br/>";
        echo "Bettlejuice" . "<br/>";
        echo "Bettlejuice" . "<br/>";
    }
    escreveNome_1();

    function escreveNome_2($nome){
        echo $nome . "<br/>";
    }

    escreveNome_2("Bills");
    escreveNome_2("Champa");

    function escreveNome_3($nome, $pontuacao) {
        echo $nome . $pontuacao . "<br/>";
    }

    escreveNome_3("Bills", "!");
    escreveNome_3("Champa", "?");

    function soma($num1, $num2){
        $total = $num1 + $num2;
        return $total;
    }

    echo soma(3, 9);

    
?>