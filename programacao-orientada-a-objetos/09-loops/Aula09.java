import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        /*
         * for (int i = 0; i <= 300; i++) { System.out.print(i + " "); }
         */

        /*
         * Scanner entrada = new Scanner(System.in); int soma = 0;
         * 
         * for (int i=0; i <= 10; i++){ soma += entrada.nextInt(); } entrada.close();
         * System.out.println("Média: " + (soma/10));
         */

        int idade, maior = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i <= 0; i++) {
            idade = entrada.nextInt();

            if (idade > maior) {
                maior = idade;
            }
        }
        entrada.close();
        System.out.println("Maior: " + maior);
    }
}
