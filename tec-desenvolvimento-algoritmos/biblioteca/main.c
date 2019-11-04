#include "lib.h"
#include <locale.h>

int menu()
{
    int escolha;
    puts("\n\n===============================\n");
    puts("MENU:\n");
    puts("1 - Verifica se um número é par;");
    puts("2 - Calculadora de potência;");
    puts("3 - Calculadora de raiz;");
    puts("4 - Verifica se um ano é bissexto;");
    puts("5 - Calculadora de média ponderada;");
    puts("6 - Calculadora de média simples;");
    puts("7 - Fatorial de um número;");
    puts("8 - Verifica se um número é primo;");
    puts("9 - Exibe uma sequência de Fibonacci;");
    puts("10 - Exibe nome e matrícula do autor deste programa.");
    puts("0 - SAIR.\n");
    puts("===============================\n");
    puts("Escolha uma das opções acima: ");
    scanf("%d", &escolha);
    return escolha;
}

int main()
{
    setlocale(LC_ALL, "Portuguese"); // Define código como escrito em Português
    
    int escolha, num;
    
    do
    {
        escolha = menu();
        switch (escolha)
        {
        case 1:
            puts("Digite um número a ser verificado se é par ou não: ");
            scanf("%d", &num);
            if(verificaSePar(num))
            {
                puts("\nO valor digitado é PAR!");
            }
            else
            {
                puts("\nO valor digitado é IMPAR!");
            }
            
            break;

        case 2:
            calculaPotencia();
            break;

        case 3:
            calculaRaiz();
            break;

        case 4:
            verificaBissexto();
            break;

        case 5:
            calculaMediaPonderada();
            break;

        case 6:
            calculaMediaSimples();
            break;

        case 7:
            fatorial();
            break;

        case 8:
            verificaSePrimo();
            break;

        case 9:
            sequenciaFibonacci();
            break;

        case 10:
            exibeDadosAutor();
            break;

        case 0:
            puts("O programa foi encerrado.");
            break;

        default:
            printf("A opção selecionada é inválida!\n");
            break;
        }

    } while (escolha != 0);

    return 0;
}

