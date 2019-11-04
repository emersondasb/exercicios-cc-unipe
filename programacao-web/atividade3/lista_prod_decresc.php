<html>
    <h1>Listas de Produtos (Decrescente por Preço)</h1>
</html>


<?php

$conexao = mysqli_connect("localhost", "root", "");

mysqli_select_db($conexao, "meubanco");

$consulta = "SELECT * FROM produto ORDER BY preco DESC";


if ($resultado = $conexao->query($consulta)) {

    while ($obj = $resultado->fetch_object()) {
        printf("Preço: R$ %s,00 | Nome: %s | Quantidade: %s", $obj->preco, $obj->nome, $obj->quantidade);
        echo "<br><br>";
    }

    $resultado->close();
}

?>

<html>
    <a href="paineldecontrole.php">Voltar</a>
</html>