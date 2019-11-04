<html>
<?php

session_start();
if($_SESSION['logou']==1){
    echo "Bem-vindo à área restrita!";
    session_destroy();
} else {
    $_SESSION['erro'] = 2;
    header('location: aula10-index.php');
}

?>
</html>