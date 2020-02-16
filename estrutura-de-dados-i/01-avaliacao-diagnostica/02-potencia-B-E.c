/* Apresentar como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, BE 
(onde B é o valor da base e E o valor do expoente), informados pelo usuário. */

#include <stdio.h>
#include <math.h>
#include <locale.h>

int main() {
    
    int B, E;
    
    printf("\nDigite um valor para a BASE: ");
    scanf("%d", &B);

    printf("\nDigite um valor para o EXPOENTE: ");
    scanf("%d", &E);

    printf("\n%d elevado a %d e %.0f", B, E, pow(B, E));
}
