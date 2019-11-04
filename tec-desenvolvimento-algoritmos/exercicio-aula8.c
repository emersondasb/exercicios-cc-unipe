/* Considere a estrutura. Faça um programa com os requisitos:
a) Cria uma conta
b) Consulta o saldo do cliente (entra com o numero da conta conferindo apenas a senha)
c) Deposita um valor (entra com o numero da conta e confere o nome do cliente)
d) Saca um valor (entra com o numero da conta e confere senha e chave, o cliente tem apenas autorização de sacar o seu dinheiro, conta sem limite)
e) Encerre a conta ( entra com o numero da conta e confere senha e chave, faça uma pergunta para que o cliente confira a operação e apague seus dados)
Obs.: Para cada item faça uma função. */

#include <stdio.h>
#include <string.h>

int num_conta = 000000;

typedef struct
{
    int num_conta, senha;
    char nome_cliente[100], chave;
    float saldo;
} conta_bancaria;


int main()
{
    conta_bancaria banco[100];

    puts("Insira o seu nome completo: ");
    scanf("%s", &banco[0].nome_cliente);






    printf("%s", banco[0].nome_cliente);


    return 0;
}
