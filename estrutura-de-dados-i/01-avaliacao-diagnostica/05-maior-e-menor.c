/*Elaborar um programa que efetue a leitura de 5 valores positivos inteiros e armazená-los em um vetor. 
Percorrer este vetor, apresentando cada valor, e encontrar e apresentar o maior e o menor valor informado pelo usuário. */

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");

    int valores[5], contador = 0, maior, menor;
    
    printf("Digite um valor: ");
    scanf("%d", &valores[contador]);
    maior = valores[contador];
    menor = valores[contador];
    contador++;

    while(contador < 5) {
        printf("Digite um valor: ");
        scanf("%d", &valores[contador]);
        if(valores[contador] > maior) {
            maior = valores[contador];
        }
        if(valores[contador] < menor) {
            menor = valores[contador];
        }
        contador++;
    }

    printf("O maior número digitado foi: %d\n", maior);
    printf("O menor número digitado foi: %d\n", menor);
    
}
