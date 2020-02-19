/*Elaborar um programa que efetue a leitura de 5 valores positivos inteiros e armazená-los em um vetor. 
Percorrer este vetor, apresentando cada valor, e encontrar e apresentar o maior e o menor valor informado pelo usuário. */

#include <stdio.h>

int main() {

    int valores[5], i = 0, maior, menor;
    
    printf("Digite um valor: ");
    scanf("%d", &valores[i]);
    maior = menor = valores[i];

    for(i=1; i < 5; i++) {
        printf("Digite um valor: ");
        scanf("%d", &valores[i]);
        if(valores[i] > maior) {
            maior = valores[i];
        }
        else if(valores[i] < menor) {
            menor = valores[i];
        }
    }

    printf("O maior numero digitado foi: %d\n", maior);
    printf("O menor numero digitado foi: %d\n", menor);
}
