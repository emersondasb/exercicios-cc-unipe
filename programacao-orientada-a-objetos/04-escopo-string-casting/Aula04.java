import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {
        /* Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Digite uma altura: ");
        float altura = teclado.nextFloat();
        System.out.println("Peso: " + peso + " | Altura: " + altura);
        teclado.close();
 */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite outro número: ");
        float n2 = teclado.nextFloat();
        System.out.println("O primeiro número é: " + n1);
        System.out.println("O segundo número é: " + n2);
        System.out.println("A soma dos dois números é: " + (n1 + n2));
        System.out.printf("A diferença dos dois números é: %.1f", (n1 - n2));
        teclado.close();
      
    }
}