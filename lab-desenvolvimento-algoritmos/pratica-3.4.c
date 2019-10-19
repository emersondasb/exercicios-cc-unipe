#include <stdio.h>

int main()
{
    float mat[10][3], nota;
    int i, j;

    for(i=0; i<10; i++)
    {
        for(j=0; j<2; j++)
        {
            scanf("%f", &nota);
            mat[i][j] = nota;
        }
        mat[i][2] = (mat[i][j]+mat[i][j-1])/2;

    }

    for(i=0; i<10; i++)
    {
        mat[i][2] = (mat[i][0]+mat[i][1])/2;
    }

    for(i=0; i<10; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("%.1f ", mat[i][j]);
        }
        
        printf("\n");
    }
    
    return 0;
}