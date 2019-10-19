#include <stdio.h>

int main()
{
    int mat[3][4], i, j, valor;

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
        for(j=0; j<3; j++)
        {
            printf("%d-", mat[i][j]);
        }
        printf("%d\n", mat[i][j]);
    }
    
    return 0;
}