import java.util.Scanner;

public class Aula05 {
    
    public static void main(final String[] args) {

        /*
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Digite o primeiro número: "); double n1 =
         * teclado.nextDouble(); System.out.println("Digite o segundo número: "); double
         * n2 = teclado.nextDouble(); teclado.close();
         * 
         * System.out.println("Adição: " + (n1+n2)); System.out.println("Subtração: " +
         * (n1-n2)); System.out.println("Multiplicação: " + (n1*n2));
         * System.out.println("Divisão: " + (n1/n2));
         */

        /*
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Digite a distância: "); double distancia =
         * teclado.nextDouble(); System.out.println("Digite o tempo: "); double tempo =
         * teclado.nextDouble(); teclado.close();
         * System.out.println("A velocidade é de " + (distancia/tempo) + " km/h");
         */

        /*
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Digite o primeiro número: "); double n1 =
         * teclado.nextDouble(); System.out.println("Digite o segundo número: "); double
         * n2 = teclado.nextDouble(); System.out.println("Digite o terceiro número: ");
         * double n3 = teclado.nextDouble(); teclado.close(); double maior =
         * ((n1>n2)?n1:n2);
         * 
         * System.out.println("O maior número é: " + ((n3>maior)?n3:maior));
         */

        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do funcionário?");

        String nome = entrada.nextLine();

        System.out.println("Qual o valor da hora trabalhada?");
        double valorHora = Double.parseDouble(entrada.next());

        System.out.println("Quantas horas você trabalhou neste mês?");
        double horasMes = Double.parseDouble(entrada.next());

        entrada.close();
        
        double salario = valorHora * horasMes;        
        
        System.out.println("Funcionário: " + nome);
        System.out.println("Valor da hora: " + valorHora + " | Horas trabalhadas: " + horasMes);
        System.out.println("Total a receber: R$ " + salario); */

        Scanner entrada = new Scanner(System.in);
        double valorProduto, valorPago, troco;

        System.out.println("Qual o valor do produto?");
        valorProduto = Double.parseDouble(entrada.next());

        System.out.println("Quanto o cliente pagou?");
        valorPago = Double.parseDouble(entrada.next());

        entrada.close();

        troco = valorPago - valorProduto;

        System.out.println("Preço do produto: R$ " + valorProduto + " | Valor recebido: R$ " + valorPago);
        System.out.println("Troco para o cliente: R$ " + troco);
    }

}