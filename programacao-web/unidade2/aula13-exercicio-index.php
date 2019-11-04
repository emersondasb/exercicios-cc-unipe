<?php
    include('header.php');
    include('conexao.php');

    $dados = mysqli_query($conexao, "SELECT * FROM comentarios");
?>

<h1>Página de Comentários</h1>

<?php
    while($tabela = mysqli_fetch_array($dados)){
    ?>
    <div class="table-responsive col-sm-6">
    <table class="table table-hover table-condensed">
    <tr>
        <td class="col-sm-1"><?php echo $tabela['id']; ?></td>
        <td class="col-sm-5" align="left"><?php echo $tabela['comentario']; ?></td>
    </tr>
}
?>
</table>
</div>
<hr>

<form method="POST" action="inserir.php" class="navbar-form navbar-left">
<input type="text" placeholder="Insira aqui o seu comentário" name="comentario" class="form-control">
<br><br>
<input type="submit" value="insirir" class="btn btn-success">
<a href="apagar.php" class="btn btn-danger">apagar tudo</a>
<a href="sair.php" class="btn btn-warning">sair</a>
</form>
</body>
</html>
