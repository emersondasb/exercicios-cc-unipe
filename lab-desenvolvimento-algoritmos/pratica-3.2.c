#include <stdio.h>

int main()
{
    int mat[3][4], i, j, valor, cincos=0;

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
            if(mat[i][j] == 5)
                cincos++;
        }
        
    }

    printf("O numero 5 apareceu %d vezes.", cincos);
    
    return 0;
}