#include <stdio.h>

struct endereco {
    char rua[100];
    int numero;
    char cep[9];
} endereco1;

struct pessoa {
    char nome[100];
    int idade;
    struct endereco endereco1;
} pessoa1;

int main()
{
    puts("Digite o seu nome: ");
    scanf("%s", &pessoa1.nome);

    puts("Digite o sua idade: ");
    scanf("%d", &pessoa1.idade);

    puts("Digite no nome da sua rua: ");
    scanf("%s", &pessoa1.endereco1.rua);

    puts("Digite no numero da sua casa: ");
    scanf("%d", &pessoa1.endereco1.numero);

    puts("Digite o seu CEP: ");
    scanf("%s", &pessoa1.endereco1.cep);

    printf("DADOS\n\
    Nome: %s\n\
    Idade: %d\n\
    Endereco \n\
    Rua: %s\n\
    Numero: %d\n\
    CEP: %s\n", pessoa1.nome, pessoa1.idade, pessoa1.endereco1.rua, \
    pessoa1.endereco1.numero, pessoa1.endereco1.cep);

    return 0;
}