#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    char texto[100], letra;
    int i;

    for (i = 0; letra != '\n'; i++)
    {
        letra = getc(stdin);
        texto[i] = letra;
    }

    texto[i] = '\0';

    puts("\nTexto normal, utilizando a máscara de formatação string (%s): ");
    printf("%s", texto);

    puts("\nCaractere a caractere em ordem crescente dos índices: ");
    for (i = 0; texto[i] != '\n'; i++)
    {
        printf("%c", texto[i]);
    }

    puts("\n\nCaractere a caractere em ordem decrescente dos índices: ");
    
    
    for (i-=1; i >= 0; i--)
    {
        printf("%c", texto[i]);
    }

    return 0;
}