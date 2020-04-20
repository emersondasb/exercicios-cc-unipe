import java.util.Scanner;

public class Aula07 {

    public static void main(String[] args) {
/*         Scanner entrada = new Scanner(System.in);
        String cavaleiro = new String();
        
        System.out.println("Digite o nome do Cavaleiro: ");
        cavaleiro = entrada.nextLine();
        
        entrada.close();
        
        if (cavaleiro.equalsIgnoreCase("Seiya")) {
            System.out.println("Pégasus");
        } else if (cavaleiro.equalsIgnoreCase("Shiryu")) {
            System.out.println("Dragão");
        } else if (cavaleiro.equalsIgnoreCase("Shun")) {
            System.out.println("Andromeda");
        } else if (cavaleiro.equalsIgnoreCase("Ikki")) {
            System.out.println("Fenix");
        } else if (cavaleiro.equalsIgnoreCase("Hyoga")) {
            System.out.println("Cisne");
        } else {
            System.out.println("Cavaleiro desconhecido");
        } */
        
/*         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String nome1 = new String();
        nome1 = entrada.nextLine();

        System.out.println("Digite um nome: ");
        String nome2 = new String();
        nome2 = entrada.nextLine();

        System.out.println("Digite um nome: ");
        String nome3 = new String();
        nome3 = entrada.nextLine();

        entrada.close();

        String maior = new String();

        if (nome1.compareTo(nome2) > 0) {
            maior = nome1;
                      
        } else {
            maior = nome2;
        }

        if (maior.compareTo(nome3) < 0){
            maior = nome3;
        }

        System.out.println("O nome mais proximo de Z é " + maior); */

       /*  Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nome_completo = entrada.nextLine();

        String primeiro_nome = nome_completo.substring(0, nome_completo.indexOf(" "));

        String ultimo_nome = nome_completo.substring(nome_completo.lastIndexOf(" ") + 1);

        entrada.close();

        System.out.println("Primeiro nome: " + primeiro_nome);
        System.out.println("Último nome: " + ultimo_nome); */

        Scanner entrada = new Scanner(System.in);
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
        }
    }
}
