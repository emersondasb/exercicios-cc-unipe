#include <stdio.h>

int main()
{
    //alocar memoria em tempo de execucao
    int n;

    scanf("%d", &n);
    int * vetor;
    vetor = (int *) malloc(n * sizeof(int));

    if(!vetor)
    {
        return -1;
    }

    free(vetor); //sempre que usar malloc() incluir o free() para liberar a memória

    return 0;
}