#include <stdio.h>

int main()
{
    char texto[100];
    int i=0, letra;

    puts("Informe o texto 1: ");
    for (i = 0; letra != '\n'; i++)
    {
        letra = getc(stdin);
        texto[i] = letra;
    }
    
    letra = 0;
    
    puts("Informe o texto 2: ");
    for (i-=1; letra != '\n'; i++)
    {
        letra = getc(stdin);
        texto[i] = letra;
    }
    
    texto[i-1] = '\0';

    printf("%s", texto);

    return 0;
}