import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = teclado.nextInt();
		System.out.println("Digite agora um nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("O número digitado foi " + n1 + " e o nome foi " + nome);
		teclado.close();
	}

}
