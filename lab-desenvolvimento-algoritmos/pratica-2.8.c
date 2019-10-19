#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    //Não consegui fazer ainda

    char texto[100], letra, invertido[100];
    int i, j = 0, retorno;

    puts("Digite algo: ");

    for (i = 0; letra != '\n'; i++)
    {
        letra = getc(stdin);
        texto[i] = letra;
    }

    for (i -= 1; i >= 0; i--)
    {
        invertido[j] = texto[i];
        j++;
    }

    printf(invertido);
    
    if (strcmp(texto, invertido) == 0)
    {
        puts("\nO texto inserido SIM é um palídrome!");
    }
    else
    {
        puts("\nO texto inserido NÃO é um palídrome!");
    }

    return 0;
}