import java.util.Random;
import java.util.Scanner;

public class padawan {
    public static void main(String[] args) {

        // 1 - CALCULADORA DE IMC
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("\n== CALCULADORA DE IMC ==\n");
         * System.out.println("Digite seu peso (Kg): "); float peso =
         * entrada.nextFloat();
         * 
         * System.out.println("Digite sua altura (m): "); float altura =
         * entrada.nextFloat();
         * 
         * float imc = peso / (altura * altura);
         * 
         * if (imc < 18.5) { System.out.printf("Seu IMC é %.2f e sua situação é MAGRO.",
         * imc); } else if (imc > 18.5 || imc < 24.9) {
         * System.out.printf("Seu IMC é %.2f e sua situação é NORMAL.", imc); } else if
         * (imc > 25.0 || imc < 29.9) {
         * System.out.printf("Seu IMC é %.2f e sua situação é SOBREPESO.", imc); } else
         * if (imc > 30.0 || imc < 34.9) {
         * System.out.printf("Seu IMC é %.2f e sua situação é OBESO.", imc); } else if
         * (imc > 35.0 || imc < 39.9) {
         * System.out.printf("Seu IMC é %.2f e sua situação é OBESIDADE MÓRBIDA.", imc);
         * } else { System.out.println("Algum dado digitado é inválido!"); }
         * entrada.close();
         */

        // 2 - CADASTRO DE SENHA E RESULTADO DE DIVISÃO
        /*
         * Scanner entrada = new Scanner(System.in);
         * 
         * System.out.println("Cadastre uma senha: "); String senhaCadastrada =
         * entrada.next();
         * 
         * System.out.println("Digite um número inteiro: "); int n1 =
         * Integer.parseInt(entrada.next());
         * 
         * System.out.println("Digite outro número inteiro: "); int n2 =
         * Integer.parseInt(entrada.next());
         * 
         * float resultado = (float) n1 / (float) n2;
         * 
         * System.out.println("Digite sua senha: "); String senhaDigitada =
         * entrada.next();
         * 
         * entrada.close();
         * 
         * if (senhaDigitada.equals(senhaCadastrada)) {
         * System.out.println("O resultado da divisão dos números digitados é: " +
         * resultado); } else { System.out.println("A senha digitada não confere!");
         * System.exit(0); }
         */

        // 3 - MENOR NOME (MAIS PRÓXIMO DA LETRA A)
        /*
         * Scanner entrada = new Scanner(System.in);
         * 
         * String menorNome = "~";
         * 
         * for (int i = 0; i < 5; i++) { System.out.printf("Digite o %dº nome: ", i +
         * 1); String palavraDigitada = entrada.next(); if
         * (menorNome.compareTo(palavraDigitada) > 0) { menorNome = palavraDigitada; } }
         * entrada.close(); System.out.println("A menor palavra digitada foi: " +
         * menorNome);
         */

        // 4 - TESTA VALIDADE DE SENHA
        /*
         * Scanner entrada = new Scanner(System.in);
         * 
         * String senhaArmazenada = "123456";
         * 
         * System.out.println("Digite a senha: "); String senhaDigitada =
         * entrada.next();
         * 
         * if (senhaArmazenada.equals(senhaDigitada)) {
         * System.out.println("Acesso liberado!"); } else {
         * System.out.println("Acesso negado!"); } entrada.close();
         */

        // 5 - TIME VENCEDOR
        /*
         * Scanner entrada = new Scanner(System.in);
         * 
         * System.out.println("Gols do Nacional de Patos: "); int golsNacionalDePatos =
         * Integer.parseInt(entrada.next());
         * 
         * System.out.println("Gols do Treze: "); int golsTreze =
         * Integer.parseInt(entrada.next());
         * 
         * if (golsNacionalDePatos > golsTreze) {
         * System.out.println("O Nacional de Patos é o vencedor!"); } else if
         * (golsNacionalDePatos < golsTreze) {
         * System.out.println("O Treze é o vencedor!"); } else {
         * System.out.println("Empate!"); } entrada.close();
         */

        // 6 - DIAS DA SEMANA
        /*
         * Scanner entrada = new Scanner(System.in);
         * 
         * System.out.
         * println("Digite um número de 1 a 7 para selecionar o dia da semana: "); int
         * dia = Integer.parseInt(entrada.next());
         * 
         * switch (dia) { case 1: System.out.println("Domingo"); break; case 2:
         * System.out.println("Segunda"); break; case 3: System.out.println("Terça");
         * break; case 4: System.out.println("Quarta"); break; case 5:
         * System.out.println("Quinta"); break; case 6: System.out.println("Sexta");
         * break; case 7: System.out.println("Sábado"); break; default:
         * System.out.println("Entrada inválida!"); break; } entrada.close();
         */

        // 7 - TESTE COM SOMA

        Scanner entrada = new Scanner(System.in);
        int A, B, C, somaAB;

        System.out.println("Digite 3 números inteiros: ");
        A = Integer.parseInt(entrada.next());
        B = Integer.parseInt(entrada.next());
        C = Integer.parseInt(entrada.next());

        entrada.close();

        somaAB = A + B;

        if (somaAB < C) {
            System.out.println("A soma de A + B é menor que C.");
        } else if (somaAB == C) {
            System.out.println("A + B é igual a C.");
        } else {
            System.out.println("A + B é maior que C.");
        }

        // 8 - SORTEIO DE NÚMEROS

        Random gerador = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.println(gerador.nextInt(60) + 1);
        }

        // 9 - NÚMEROS PARES

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // 10 - CALCULA MÉDIA

        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Digite as três notas: ");
        double nota1 = Double.parseDouble(entrada1.next());
        double nota2 = Double.parseDouble(entrada1.next());
        double nota3 = Double.parseDouble(entrada1.next());
        entrada1.close();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é: " + media);

    }
}