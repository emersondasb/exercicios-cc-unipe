#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    char texto[100], letra;
    int i;

    for(i; letra != '\n'; i++)
    {
        letra = getc(stdin);
		texto[i] = letra;
    }
    
    texto[i] = '\0';
    
    puts("\nO texto escrito com letras maiúsculas: ");
    for(i=0; texto[i] != '\0'; i++)
	{
		printf("%c", toupper(texto[i]));
	}
	
    puts("\nO texto escrito com letras minúsculas: ");
    for(i=0; texto[i] != '\0'; i++)
	{
		printf("%c", tolower(texto[i]));
	}

    return 0;
}