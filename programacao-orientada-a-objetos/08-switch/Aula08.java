import java.util.Scanner;

public class Aula08 {

    public static void main(String[] args) {
/*         Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();
        entrada.close();

        switch(codigo) {
            case 0:
                System.out.println("Cachorro quente");
                System.out.println("Total: R$ " + (double)quantidade * 1.5);
                break;
            case 1:
                System.out.println("Refrigerante");
                System.out.println("Total: R$ " + (double)quantidade * 2.0);
                break;
            default:
                System.out.println("Entrada inválida.");
        } */

        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        int codigo = entrada.nextInt();
        entrada.close();

        switch (codigo) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Hamburger");
                break;
            case 3:
                System.out.println("Refrigerante");
                break;
            case 4:
                System.out.println("Batata frita");
                break;
            default:
                System.out.println("Entrada inválida");
        } */

/*         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        int estacao = entrada.nextInt();
        entrada.close();

        switch (estacao) {
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Entrada inválida");
        } */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();

        System.out.println("Qual operação deseja executar?");
        System.out.println("1-adição | 2-subtração | 3-multiplicação | 4-divisão");
        int operacao = entrada.nextInt();
        entrada.close();

        switch (operacao) {
            case 1:
                System.out.println("Soma");
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }
}
