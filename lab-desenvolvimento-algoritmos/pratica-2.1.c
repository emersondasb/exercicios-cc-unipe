#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");

	int lista[5];
	int numero, i;

	puts("Digite 5 números teclando ENTER entre um e outro: ");
	for (i = 0; i < 5; i++)
	{
		scanf("%d", &lista[i]);
	}

	puts("\nOs números digitados na ordem crescente de índice é: ");
	for (i = 0; i < 5; i++)
	{
		printf("%d ", lista[i]);
	}

	puts("\n\nOs números digitados na ordem decrescente de índice é: ");
	for (i = 4; i >= 0; i--)
	{
		printf("%d ", lista[i]);
	}
}
