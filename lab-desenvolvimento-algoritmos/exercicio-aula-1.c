#include <stdio.h>
#include <locale.h> // Biblioteca necessaria para localizacao em Português
#include <math.h>

int verificaSePar();
int calculaPotencia();
int calculaRaiz();
int verificaBissexto();
int calculaMediaPonderada();
int calculaMediaSimples();
int exibeDadosAutor();
int fatorial();
int verificaSePrimo();
int sequenciaFibonacci();

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

int verificaSePar(int num)
{
    if (num % 2 == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int calculaPotencia()
{
    float base;
    int expoente;
    float potencia;

    puts("\nDigite o valor da base da potência a ser calculada: ");
    scanf("%f", &base);

    puts("\nDigite o valor do expoente: ");
    scanf("%d", &expoente);

    potencia = pow(base, expoente);
    printf("\nA potência é: %e", potencia);
}

int calculaRaiz()
{
    float radicando, indice, raiz;

    puts("\nDigite o valor do radicando da raiz a ser calculada: ");
    scanf("%f", &radicando);

    puts("\nDigite o valor do índice: ");
    scanf("%f", &indice);

    raiz = pow(radicando, 1 / indice);
    printf("\nA raiz é: %e", raiz);
}

int verificaBissexto()
{
    int ano;

    puts("\nDigite o ano a ser verificado se é bissexto: ");
    scanf("%d", &ano);

    if (ano % 4 == 0)
    {
        puts("O ano informado é bissexto!");
    }
    else
    {
        puts("O ano informado NãO é bissexto!");
    }
}

int calculaMediaPonderada()
{
    float nota1, nota2, nota3, media, pontos;

    puts("\nDigite o valor da nota 1: ");
    scanf("%f", &nota1);

    puts("\nDigite o valor da nota 2: ");
    scanf("%f", &nota2);

    puts("\nDigite o valor da nota 3: ");
    scanf("%f", &nota3);

    media = ((nota1 * 1 + nota2 * 1 + nota3 * 2) / (1 + 1 + 2));
    pontos = nota1 * 1 + nota2 * 1 + nota3 * 2;

    printf("\nA média do aluno foi %.2f", media);
    if (pontos >= 60)
    {
        puts("\nO aluno foi aprovado!");
    }
    else
    {
        puts("\nO aluno foi reprovado!");
    }
}

int calculaMediaSimples()
{
    float nota1, nota2;

    puts("\nDigite o valor da nota 1: ");
    scanf("%f", &nota1);

    puts("\nDigite o valor da nota 2: ");
    scanf("%f", &nota2);

    if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10)
    {
        puts("\nNota informada inválida!");
    }
    else
    {
        printf("A média dessas notas é %.2f", (nota1 + nota2) / 2);
    }
}

int exibeDadosAutor()
{
    char nome[] = "Emerson Bezerra";
    int matricula = 1910025017;

    printf("\nNome do Autor: %s", nome);
    printf("\nMatrícula: %x", matricula);
}

int fatorial()
{
    int numero, i;
    puts("\nDigite o número a ser fatorado: ");
    scanf("%d", &numero);

    for(i = numero - 1; i > 0; i--)
    {
        numero *= i;
    }

    printf("%d", numero);
}


int verificaSePrimo()
{
    // Número primo: divisível por 1 e por ele mesmo APENAS
    // Possui, portanto, só dois divisores

    int numero, divisores = 0, i;

    puts("Digite um número a ser verificado se é primo: ");
    scanf("%d", &numero);

    for(i = 1; i <= numero; i++)
    {
        if(numero % 2 == 0)
        {
            divisores++;
        }
    }

    if(divisores > 2)
    {
        puts("\nO número informado NãO é primo.");
    }
    else
    {
        puts("\nO número informado SIM é primo.");
    }
}



int sequenciaFibonacci()
{
    int elementos, i;
    unsigned int sequencia[100] = {1, 1};

    puts("Digite quantos elementos da sequência você quer que sejam exibidos: ");
    scanf("%d", &elementos);

    for(i = 2; i <= elementos; i++)
    {
        sequencia[i] = sequencia[i-1] + sequencia[i-2];
    }

    for(i = 0; i < elementos; i++)
    {
        printf("%d ", sequencia[i]);
    }
}

