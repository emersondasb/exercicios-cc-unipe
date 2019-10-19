#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    //Não consegui fazer ainda
    
    char nome[100][100];
    int i, j;

    puts("Digite o seu nome completo: ");

    for(i=0; ; i++)
    {
        scanf("%s", &nome[i]);
    }

    printf("%d", i);

    return 0;
}