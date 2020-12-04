import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    	TabelaHash tabelaHash = new TabelaHash();
    	
//    	tabelaHash.inserir(18291877, "José de Alencar", 48);
//    	tabelaHash.inserir(19011964, "Cecília Meireles", 63);
//    	tabelaHash.inserir(19021987, "Carlos Drummond de Andrade", 83);
//    	tabelaHash.inserir(18391908, "Machado de Assis", 69);
//    	tabelaHash.inserir(19201977, "Clarice Lispector", 57);
//    	tabelaHash.inserir(19201999, "João Cabral de Melo Neto", 79);
//    	tabelaHash.inserir(18921953, "Graciliano Ramos", 61);
//    	tabelaHash.inserir(19061994, "Mario Quintana", 88);
//    	tabelaHash.inserir(19081967, "Guimarães Rosa", 59);
    	
//    	tabelaHash.buscar(18291877);
//    	tabelaHash.buscar(19011964);
//    	tabelaHash.buscar(19021987);
//    	tabelaHash.buscar(18391908);
//    	tabelaHash.buscar(19201977);
//    	tabelaHash.buscar(19201999);
//    	tabelaHash.buscar(18921953);
//    	tabelaHash.buscar(19061994);
    	
//    	tabelaHash.exibir();
//    	System.out.println();
//    	tabelaHash.buscar(19081967);
//    	tabelaHash.remover(19081967);
//    	tabelaHash.buscar(19081967);
//    	System.out.println();
//    	tabelaHash.exibir();
    	
    	int opcaoMenu = -1;
    	int matricula;
		String nome;
		String sobrenome;
		int idade;
		int tempoSleepDaNavegacao = 2;
    	
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Atividade avaliativa do prof. Wallace Bonfim - Disciplina de Estrutura de Dados II - 2020.2.");
    	System.out.println("Projeto desenvolvido por: Dellano Derek (RGM: 10746005), Emerson Bezerra (RGM: 10749217) e Enoque Belmiro (RGM: 10766294).\n");
    	
    	while (opcaoMenu != 0) {
			System.out.println("======================\n"
					+ "|        MENU        |\n"
					+ "======================");
			System.out.println("Selecione uma operação:");
			System.out.println("1 - Inserir aluno.\n"
					+ "2 - Buscar aluno.\n"
					+ "3 - Remover aluno.\n"
					+ "4 - Exibir alunos.\n"
					+ "0 - Encerrar o programa.");
			
			opcaoMenu = Integer.parseInt(entrada.next());			
			
			switch (opcaoMenu) {		
				
				case 1:			
					System.out.println("Matrícula: ");
					matricula = entrada.nextInt();
					
					System.out.println("Primeiro nome: ");
					nome = entrada.next();
					
					System.out.println("Último nome: ");
					sobrenome = entrada.next();
					
					System.out.println("Idade: ");
					idade = entrada.nextInt();
					
					String nomeCompleto = nome + " " + sobrenome;
					tabelaHash.inserir(matricula, nomeCompleto, idade);		
					
					System.out.println("Aluno inserido com sucesso!\n\n");
					TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
					break;
				
				case 2:
					System.out.println("Digite a matrícula: ");
					matricula = entrada.nextInt();
					tabelaHash.buscar(matricula);
					System.out.println();
					TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
					break;
					
				case 3:
					System.out.println("Digite a matrícula: ");
					matricula = entrada.nextInt();
					tabelaHash.remover(matricula);
					System.out.println("Aluno removido.\n");
					TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
					break;
					
				case 4:
					System.out.println("Lista de Alunos:");
					tabelaHash.exibir();
					System.out.println();
					TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
					break;
					
				case 0:
					break;
				
			}
		}
		entrada.close();
		System.out.println("Programa encerrado.");
    	
    }
}
