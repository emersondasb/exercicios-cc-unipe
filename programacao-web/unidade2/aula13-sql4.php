<?php
$conexao= mysqli_connect("localhost", "root", "");
mysqli_select_db($conexao, "meubd"); 
$dados = mysqli_query($conexao, "SELECT * FROM PESSOAS");

while($tabela = mysqli_fetch_array($dados)) {
    echo$tabela['nome'] . '<br/>';
}  
    
?>