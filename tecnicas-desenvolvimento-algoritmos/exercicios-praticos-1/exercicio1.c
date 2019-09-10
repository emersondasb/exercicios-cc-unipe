#include <stdio.h>
// Biblioteca necessária para acentuacao
#include <locale.h>

int main() {

// Permite acentuacao:
setlocale(LC_ALL, "Portuguese");

int numero = 1;

char menu[9][8] = {"Opcao 1", "Opcao 2", "Opcao 3", "Opcao 4", "Opcao 5", "Opcao 6", "Opcao 7", "Opcao 8", "Opcao 9"};

while (numero != 0) {

    // Solicita valor ao usuario:
    printf("Selecione um item do MENU de 1 a 9 ou 0 para SAIR: \n");
    scanf("%d", &numero);

    // Caso o valor digitado seja 0:
    if (numero == 0) {
        break;
    }

    // Caso o valor digitado seja fora do escopo:
    else if (numero < 0 || numero > 9) {
        printf("A opcao digitada é inválida\n");
    }

    // Mostra a opcao escolhida: 
    else {
        printf("A opcao escolhida foi %s.\n", menu[numero-1]);
    }
}

// Mensagem de saída do programa:
printf("O programa foi encerrado.\n");

}