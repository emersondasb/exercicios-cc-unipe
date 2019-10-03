#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    int lista[10], i, maior_numero=NULL;


    puts("Digite 10 números teclando ENTER entre eles: ");
    for(i=0; i<10; i++)
    {
        scanf("%d", &lista[i]);

        if(lista[i] > maior_numero)
        {
            maior_numero = lista[i];
        }
    }
    
    puts("\nOs números digitados foram: ");
    for(i=0; i<10; i++){
        printf("%d ", lista[i]);
    }
    printf("\n\nO maior número digitado foi: %d.", maior_numero);

    return 0;
}