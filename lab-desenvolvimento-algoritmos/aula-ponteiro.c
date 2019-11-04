#include <stdio.h>

int main()
{
    int x = 4, y = 7;
    int * pI = &x;
    float f = 5.4;
    char c = 'a';

    printf("%x - %d\n%x - %x\n%d", &x, x, &pI, pI, *pI);
}


#include <stdio.h>

int main()
{
    char vet[] = "Casa de Papel", * pV;
    pV = vet;

    while(*pV != '\0')
    {
        printf("%c\n", *pV++);
    }
}
