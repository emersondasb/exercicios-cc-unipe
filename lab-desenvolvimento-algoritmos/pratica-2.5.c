#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    char palavra_1[100], palavra_2[100];
    int comparacao;

    puts("Digite uma palavra: ");
    scanf("%s", &palavra_1);

    puts("\nDigite outra palavra: ");
    scanf("%s", &palavra_2);

    printf("\nA quantidade de caracteres da primeira palavra é: %d", strlen(palavra_1));
    printf("\nA quantidade de caracteres da segunda palavra é: %d", strlen(palavra_2));

    comparacao = strcmp(palavra_1, palavra_2);

    if (comparacao == 0)
    {
        puts("\nAs palavras digitadas são iguais.");
    }
    else if (comparacao < 0)
    {
        puts("\nAs palavras digitadas são diferentes e a primeira é maior que a segunda.");
    }
    else if (comparacao > 0)
    {
        puts("\nAs palavras digitadas são diferentes e a segunda é maior que a primeira.");
    }

    return 0;
}