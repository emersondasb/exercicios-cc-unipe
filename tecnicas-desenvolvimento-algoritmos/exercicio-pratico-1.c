#include <stdio.h>
#include <locale.h> // Biblioteca necessária para localização em Português
#include <math.h>

int verificaSePar();
int calculaPotencia();
int calculaRaiz();
int verificaBissexto();
int calculaMediaPonderada();
int calculaMediaSimples();
int exibeDadosAutor();
int escolha = 0;
char menu[] = \
"\n\n===============================\n\
MENU:\n\
1 - Verifica se um número é par;\n\
2 - Calculadora de potência;\n\
3 - Calculadora de raiz;\n\
4 - Verifica se um ano é bissexto;\n\
5 - Calculadora de média ponderada;\n\
6 - Calculadora de média simples;\n\
7 - A ser implementado;\n\
8 - A ser implementado;\n\
9 - A ser implementado;\n\
10 - Exibe nome e matrícula do autor deste programa.\n\
0 - SAIR.\n\
===============================";

int main() 
{
    setlocale(LC_ALL, "Portuguese"); // Define código como escrito em Português
    
    do
    {
        puts(menu);
        puts("Escolha uma das opções acima: ");
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

int verificaSePar()
{
    int num;
    puts("Digite um número a ser verificado se é par ou não: ");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        puts("\nÉ par!");
    } 
    else 
    {
        puts("\nÉ impar!");
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
	float radicando;
    float indice;
    float raiz;

    puts("\nDigite o valor do radicando da raiz a ser calculada: ");
    scanf("%f", &radicando);

    puts("\nDigite o valor do índice: ");
    scanf("%f", &indice);

    raiz = pow(radicando, 1/indice);
    printf("\nA raiz é: %e", raiz);
}

int verificaBissexto()
{
	int ano;
	
    puts("\nDigite o ano a ser verificado se é bissexto: ");
    scanf("%d", &ano);
    
    if(ano%4==0)
    {
    	puts("O ano informado é bissexto!");
	}
	else
	{
		puts("O ano informado NÃO é bissexto!");
	}
    
}

int calculaMediaPonderada()
{
	float nota1;
	float nota2;
	float nota3;
	float media;
	float pontos;
	
	puts("\nDigite o valor da nota 1: ");
    scanf("%f", &nota1);

	puts("\nDigite o valor da nota 2: ");
    scanf("%f", &nota2);

	puts("\nDigite o valor da nota 3: ");
    scanf("%f", &nota3);
	
	media = ((nota1*1 + nota2*1 + nota3*2)/(1+1+2));
	pontos = nota1*1 + nota2*1 + nota3*2;
	
	printf("\nA média do aluno foi %.2f", media);
	if(pontos>=60)
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
	float nota1;
	float nota2;
	
	puts("\nDigite o valor da nota 1: ");
    scanf("%f", &nota1);

	puts("\nDigite o valor da nota 2: ");
    scanf("%f", &nota2);
    
    if(nota1<0 || nota1>10 || nota2<0 || nota2>10)
    {
    	puts("\nNota informada inválida!");
	}
	else
	{
		printf("A média dessas notas é %.2f", (nota1+nota2)/2);
	}
}

int exibeDadosAutor()
{
	char nome[] = "Emerson Bezerra";
	int matricula = 1910025017;
	
	printf("\nNome do Autor: %s", nome);
	printf("\nMatrícula: %x", matricula);
}