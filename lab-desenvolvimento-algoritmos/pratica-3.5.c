#include <stdio.h>

int main()
{
    int i, j, tamanho;

    puts("Qual o tamanho do quadrado quer que seja desenhado? ");
    scanf("%d", &tamanho);

    for(i=0; i<tamanho; i++)
    {
        for(j=0; j<tamanho; j++)
        {
            printf("X ");
        }
        printf("\n");
    }

    return 0;
}