/*Calcular a área total de uma residência (por exemplo, sala, cozinha, banheiro, quartos, área de serviço, quintal garagem, etc.). 
O programa deverá solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo e armazenar estes dados em uma estrutura 
do tipo REGISTRO (typedef struct). Em seguida, deverá calcular a área do cômodo lido e armazenar o resultado na no registro. Apresentar a 
mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda "NÃO", o programa deverá recuperar 
e apresentar todos valores gravados na estrutura e o valor da área total.*/

#include <stdio.h>
#include <string.h>

float calcula_area();

typedef struct area
{
    char comodo[500];
    float largura;
    float comprimento;
} residencia;

int main() 
{
    residencia residencia[100];
    int novo_comodo = 1;
    int contador = 0;
    float area_total;
    
    while(novo_comodo == 1) 
    {
        for(contador; novo_comodo != 0; contador++)
        {
            puts("Digite o nome do comodo: ");
            fgets(residencia[contador].comodo, 50, stdin);

            residencia[contador].comodo[strlen(residencia[0].comodo) - 1] = '\0'; //remove o ENTER '\n' ao final da entrada da string

            puts("Digite a largura do comodo: ");
            scanf("%f", &residencia[contador].largura);

            puts("Digite o comprimento do comodo: ");
            scanf("%f", &residencia[contador].comprimento);

            puts("Gostaria de acrescentar um novo comodo? Para SIM, tecle '1' para NAO tecle '0'.");
            scanf("%d", &novo_comodo);

            fflush(stdin);
        }
    }

    printf("\n\nNome do comodo: %s.", residencia[0].comodo);
    printf("\nNome largura do comodo: %f.", residencia[0].largura);
    printf("\nNome comprimento do comodo: %f.", residencia[0].comprimento);

}

 