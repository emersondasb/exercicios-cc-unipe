<?php

    setcookie("usuario", "Goku", (time()+3600));
    setcookie("lang", "português");
    setcookie("login", "false", (time()+(24*3600)));
    // corpo do script

    //echo $_COOKIE["usuario"];

    //"Forçando" a expiração de um cookie
    //setcookie("usuario", "Goku", (time()-3600));

    print_r($_COOKIE);

?>