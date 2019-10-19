#include <stdio.h>

int main()
{
    int mat[3][4], i, j, valor, maior, menor;

    for(i=0; i<3; i++)
    {
        for(j=0; j<4; j++)
        {
            scanf("%d", &valor);
            mat[i][j] = valor;
        }
    }

    for(i=0; i<3; i++)
    {
        for(j=0; j<4; j++)
        {
            if(mat[i][j] < menor)
                menor = mat[i][j];
            if(mat[i][j] > maior)
                maior = mat[i][j];
        }
        
    }

    printf("\nO maior numero e %d.", maior);
    printf("\nO menor numero e %d.", menor);
    
    return 0;
}