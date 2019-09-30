<?php
    $valor1 = $_POST['valor1'];
    $valor2 = $_POST['valor2'];
    
    include("aula08-calculadora-operacoes.php");

    if(isset($_POST['soma'])){
        echo somar($valor1, $valor2);
    } elseif (isset($_POST['subtracao'])) {
        echo subtrair($valor1, $valor2);
    } elseif (isset($_POST['multiplicacao'])) {
        echo multiplicar($valor1, $valor2);
    } elseif (isset($_POST['divisao'])) {
        echo dividir($valor1, $valor2);
    }

?>