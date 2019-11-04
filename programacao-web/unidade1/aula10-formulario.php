<?php

session_start();
$login = "admin";
$senha = "123";

if (($_POST['login']==$login) && ($_POST['senha']==$senha)){
    $_SESSION['logou'] = 1;
    header('location: aula10-arearestrita.php');
} else {
    $_SESSION['erro'] = 1;
    header('location: aula10-index.php');
}
?>