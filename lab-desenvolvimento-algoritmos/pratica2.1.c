#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	
	int lista[5];
	int numero, i;
	
	puts("Digite 5 n�meros teclando ENTER entre um e outro: ");
	
	for(i=0; i<5;)
	{
		numero = getc(stdin);
		
		if(numero != '\n')
		{
			lista[i] = numero;
			i++;
		} 
	}

	puts("\nOs n�meros digitados na ordem crescente de �ndice �: ");
	for(i=0; i<5 ; i++)
	{
		printf("%c ", lista[i]);
	}
	
	puts("\n\nOs n�meros digitados na ordem decrescente de �ndice �: ");
	for(i=4; i>=0 ; i--)
	{
		printf("%c ", lista[i]);
	}
}

