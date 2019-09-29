#include <stdio.h>
#include <locale.h> // Biblioteca necess�ria para localiza��o em Portugu�s
#include <math.h>

int verificaSePar();
int calculaPotencia();
int calculaRaiz();
int verificaBissexto();
int calculaMediaPonderada();
int calculaMediaSimples();
int exibeDadosAutor();
int escolha = 0;
int fatorial();
int verificaSePrimo();
int sequenciaFibonacci();

char menu[] =
    "\n\n===============================\n\
MENU:\n\
1 - Verifica se um n�mero � par;\n\
2 - Calculadora de pot�ncia;\n\
3 - Calculadora de raiz;\n\
4 - Verifica se um ano � bissexto;\n\
5 - Calculadora de m�dia ponderada;\n\
6 - Calculadora de m�dia simples;\n\
7 - Fatorial de um n�mero;\n\
8 - Verifica se um n�mero � primo;\n\
9 - Exibe uma sequ�ncia de Fibonacci;\n\
10 - Exibe nome e matr�cula do autor deste programa.\n\
0 - SAIR.\n\
===============================";

int main()
{
    setlocale(LC_ALL, "Portuguese"); // Define c�digo como escrito em Portugu�s

    do
    {
        puts(menu);
        puts("Escolha uma das op��es acima: ");
        scanf("%d", &escolha);

        switch (escolha)
        {
        case 1:
            verificaSePar();
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
            printf("A op��o selecionada � inv�lida!\n");
            break;
        }

    } while (escolha != 0);

    return 0;
}

int verificaSePar()
{
    int num;
    puts("Digite um n�mero a ser verificado se � par ou n�o: ");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        puts("\n� par!");
    }
    else
    {
        puts("\n� impar!");
    }
}

int calculaPotencia()
{
    float base;
    int expoente;
    float potencia;

    puts("\nDigite o valor da base da pot�ncia a ser calculada: ");
    scanf("%f", &base);

    puts("\nDigite o valor do expoente: ");
    scanf("%d", &expoente);

    potencia = pow(base, expoente);
    printf("\nA pot�ncia �: %e", potencia);
}

int calculaRaiz()
{
    float radicando, indice, raiz;

    puts("\nDigite o valor do radicando da raiz a ser calculada: ");
    scanf("%f", &radicando);

    puts("\nDigite o valor do �ndice: ");
    scanf("%f", &indice);

    raiz = pow(radicando, 1 / indice);
    printf("\nA raiz �: %e", raiz);
}

int verificaBissexto()
{
    int ano;

    puts("\nDigite o ano a ser verificado se � bissexto: ");
    scanf("%d", &ano);

    if (ano % 4 == 0)
    {
        puts("O ano informado � bissexto!");
    }
    else
    {
        puts("O ano informado N�O � bissexto!");
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

    printf("\nA m�dia do aluno foi %.2f", media);
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
        puts("\nNota informada inv�lida!");
    }
    else
    {
        printf("A m�dia dessas notas � %.2f", (nota1 + nota2) / 2);
    }
}

int exibeDadosAutor()
{
    char nome[] = "Emerson Bezerra";
    int matricula = 1910025017;

    printf("\nNome do Autor: %s", nome);
    printf("\nMatr�cula: %x", matricula);
}

int fatorial()
{
    int numero;
    puts("\nDigite o n�mero a ser fatorado: ");
    scanf("%d", &numero);

    for(int i = numero - 1; i > 0; i--)
    {
        numero *= i;
    }

    printf("%d", numero);
}


int verificaSePrimo()
{
    // N�mero primo: divis�vel por 1 e por ele mesmo APENAS
    // Possui, portanto, s� dois divisores

    int numero, divisores = 0;

    puts("Digite um n�mero a ser verificado se � primo: ");
    scanf("%d", &numero);

    for(int i = 1; i <= numero; i++)
    {
        if(numero % 2 == 0)
        {
            divisores++;
        }
    }

    if(divisores > 2)
    {
        puts("\nO n�mero informado N�O � primo.");
    }
    else
    {
        puts("\nO n�mero informado SIM � primo.");
    }
}



int sequenciaFibonacci()
{
    int elementos;
    unsigned int sequencia[100] = {1, 1};

    puts("Digite quantos elementos da sequ�ncia voc� quer que sejam exibidos: ");
    scanf("%d", &elementos);

    for(int i = 2; i <= elementos; i++)
    {
        sequencia[i] = sequencia[i-1] + sequencia[i-2];
    }

    for(int i = 0; i < elementos; i++)
    {
        printf("%d ", sequencia[i]);
    }
}

