/*Apresentar a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34,... etc. 
Esta série se caracteriza pela soma de um termo posterior com o seu anterior subsequente.*/

#include <stdio.h>

int main() {
    int anterior = 1, atual = 1, proximo, contador = 3;
    printf("%d, %d", anterior, atual);
    for(contador; contador < 16; contador++) {
        proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
        printf(", %d", proximo);
    }
}
