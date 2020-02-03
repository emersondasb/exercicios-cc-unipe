#include <stdio.h>

int main()
{
    float calcula_area();

    struct area_quarto
    {
        float largura_quarto;
        float comprimento_quarto;
    };

    struct area_cozinha
    {
        float largura_cozinha;
        float comprimento_cozinha;
    };

    struct area_sala
    {
        float largura_sala;
        float comprimento_sala;
    };

    struct area_casa
    {
        struct area_quarto;
        struct area_cozinha;
        struct area_sala;
    } casa;

    puts("\nInforme a largura do quarto: ");
    scanf("%f", &casa.largura_quarto);

    puts("\nInforme o comprimento do quarto: ");
    scanf("%f", &casa.comprimento_quarto);

    puts("\nInforme a largura da cozinha: ");
    scanf("%f", &casa.largura_quarto);

    puts("\nInforme o comprimento da cozinha: ");
    scanf("%f", &casa.comprimento_quarto);

    puts("\nInforme a largura da sala: ");
    scanf("%f", &casa.largura_quarto);

    puts("\nInforme o comprimento da sala: ");
    scanf("%f", &casa.comprimento_quarto);

    printf("\nA largura do quarto é: %f", calcula_area(casa.largura_quarto, casa.comprimento_quarto));

    return 0;
}

float calcula_area(float x, float y)
{
    return x * y;
}