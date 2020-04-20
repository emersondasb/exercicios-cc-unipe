import java.util.Scanner;

public class Aula06 {

    /*
     * public static void main(String[] args) { double n1 = 10; double n2 = 3;
     * double resultado = n1/n2; System.out.printf("%.2f", resultado); }
     */

    /*
     * public static void main(String[] args) { double n1 = 10; double n2 = 3;
     * double resultado = n1/n2; System.out.println(String.format("%.2f",
     * resultado)); }
     */

    /*
     * public static void main(String[] args) { double i = 10; String str =
     * String.valueOf(i); System.out.println(str); }
     */

    /*
     * public static void main(String[] args) { double i = 10; if (i > 10) i++; i++;
     * System.out.println(i); }
     */

    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        entrada.close();
        
        if (idade >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
    }
}
