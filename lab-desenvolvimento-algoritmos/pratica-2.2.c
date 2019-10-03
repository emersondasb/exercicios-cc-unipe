#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int lista[10], i=0, numero_tres=0;

    puts("Digite 10 números teclando ENTER entre eles para confirmar: ");
    for(i; i < 10 ; i++)
    {
        scanf("%d", &lista[i]);
        
        if(lista[i] == 3)
        {
            numero_tres++;
        }
    }

    printf("O número \'3\' foi digitado \'%d\' vezes.", numero_tres);

    return 0;
}