/*Calcular e apresentar o somatório do número de grãos de trigo que se pode colocar em um tabuleiro de xadrez, obedecendo à seguinte regra: 
colocar um grão de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro quadro coloca-se 1 grão, 
no segundo quadro coloca-se 2 grãos (neste momento têm-se 3 grãos), no terceiro quadro coloca-se 4 grãos (tendo neste momento 7 grãos), 
no quarto quadro colocam-se 8 grãos (tendo-se então 15 grãos) até atingir o sexagésimo quadro 
(Este exercício foi baseado numa situação exposta no capítulo 16 do livro ”O Homem que Calculava” de Malba Tahan da Editora Record).
https://en.wikipedia.org/wiki/C_data_types
*/

#include <stdio.h>

int main() {

    int quadro = 0, quatidade_anterior = 1, quantidade_atual = 1;
    unsigned long long somatorio = 0;


    for(quadro; quadro < 64; quadro++) {
        quantidade_atual = 2 * quatidade_anterior;
        somatorio += quatidade_anterior;
        quatidade_anterior = quantidade_atual;
    }

    printf("O somatorio e: %llu\n", somatorio);
}
