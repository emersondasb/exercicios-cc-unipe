import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();

		int[] vetor;
		int opcaoMenu = -1;
		int tempoSleepDaNavegacao = 2;

		Scanner entrada = new Scanner(System.in);
		System.out.println(
				"Atividade avaliativa do prof. Wallace Bonfim - Disciplina de Estrutura de Dados II - 2020.2.");
		System.out.println(
				"Projeto desenvolvido por: Dellano Derek (RGM: 10746005), Emerson Bezerra (RGM: 10749217) e Enoque Belmiro (RGM: 10766294).\n");

		while (opcaoMenu != 0) {

			System.out.println("======================\n" + "|        MENU        |\n" + "======================");
			System.out.println("Selecione um algoritmo de ordenação:");
			System.out.println("1 - Bubble Sort.\n" + "2 - Selection Sort.\n" + "3 - Insertion Sort.\n"
					+ "4 - Merge Sort.\n" + "5 - Quick Sort.\n" + "0 - Encerrar o programa.");

			opcaoMenu = Integer.parseInt(entrada.next());

			switch (opcaoMenu) {

			case 1:
				vetor = gerarVetor(tempoSleepDaNavegacao);
				bubbleSort.ordenarVetor(vetor);
				imprimirVetor(vetor, "Bubble Sort");
				break;

			case 2:
				vetor = gerarVetor(tempoSleepDaNavegacao);
				selectionSort.ordenarVetor(vetor);
				imprimirVetor(vetor, "Selection Sort");
				break;

			case 3:
				vetor = gerarVetor(tempoSleepDaNavegacao);
				insertionSort.ordenarVetor(vetor);
				imprimirVetor(vetor, "Insertion Sort");
				break;

			case 4:
				vetor = gerarVetor(tempoSleepDaNavegacao);
				mergeSort.ordenarVetor(vetor);
				imprimirVetor(vetor, "Merge Sort");
				break;

			case 5:
				vetor = gerarVetor(tempoSleepDaNavegacao);
				quickSort.ordenarVetor(vetor);
				imprimirVetor(vetor, "Quick Sort");
				break;

			case 0:
				break;

			}
		}
		entrada.close();
		System.out.println("Programa encerrado.");
	}

	private static int[] gerarVetor(int tempoSleepDaNavegacao) throws InterruptedException {
		int[] vetor;
		vetor = Utils.gerarVetor(10, 100);
		System.out.println("Ordenando o seguinte vetor:");
		Utils.imprimirVetor(vetor);
		TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
		return vetor;
	}

	private static void imprimirVetor(int[] vetor, String algoritmo) throws IOException {
		System.out.println("\nVetor ordenado com " + algoritmo + ":");
		Utils.imprimirVetor(vetor);
		System.out.println("\nTecle ENTER para ir para o MENU.");
		System.in.read();
	}
}
