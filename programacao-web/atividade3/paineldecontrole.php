<?php
    session_start();
    if(isset($_SESSION['logado'])){

    } else {
        header('location: login.html');
    }
?>


<html>
<body>
<h1>Painel de controle</h1><br>

<button onclick="window.location.href='inserirproduto.html'">Inserir produto</button> <br><br>
<button onclick="window.location.href='lista_prod_cresc.php'">Listar produtos (crescente)</button> <br><br>
<button onclick="window.location.href='lista_prod_decresc.php'">Listar produtos (decrescente)</button> <br><br>
<button onclick="window.location.href='logout.php'">Sair</button> <br><br>
</body>
</html>


