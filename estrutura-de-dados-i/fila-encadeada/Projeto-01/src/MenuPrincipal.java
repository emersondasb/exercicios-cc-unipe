import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MenuPrincipal {

	public static void main(String[] args) throws InterruptedException {
		ListaSequencial listasequencial = new ListaSequencial();
		ListaEncadeada listaencadeada = new ListaEncadeada();
		PilhaSequencial pilhasequencial = new PilhaSequencial();
		PilhaEncadeada pilhaencadeada = new PilhaEncadeada();
		
		int tempoSleepDaNavegacao = 2;
		
		int opcaoMenuPrincipal = -1;
		
		Scanner entrada = new Scanner(System.in);
		
		
		while (opcaoMenuPrincipal != 0) {
			System.out.println("======================\n"
					+ "|   MENU PRINCIPAL   |\n"
					+ "======================");
			System.out.println("Selecione uma das estruturas de dados a seguir:");
			System.out.println("1 - Lista sequencial.\n"
					+ "2 - Lista encadeada.\n"
					+ "3 - Pilha sequencial.\n"
					+ "4 - Pilha encadeada.\n"
					+ "0 - Encerrar o programa.");
			
			opcaoMenuPrincipal = Integer.parseInt(entrada.next());
			
			switch (opcaoMenuPrincipal) {
				
			case 1: 
				int opcaoListaSequencial = -1;
				while(opcaoListaSequencial != 4) {
					int posicao = -1;
					PessoaSequencial novaPessoa = new PessoaSequencial();
					System.out.println("======================\n"
							+ "|  LISTA SEQUENCIAL  |\n"
							+ "======================");
					System.out.println("Selecione uma operação:\n"
							+ "1 - Inserir nome.\n"
							+ "2 - Remover nome.\n"
							+ "3 - Exibir nomes cadastrados.\n"
							+ "4 - Voltar ao menu anterior.\n");
					opcaoListaSequencial = Integer.parseInt(entrada.next());
							
					switch (opcaoListaSequencial) {

						case 1: 
							boolean resposta;	
							
							
							System.out.println("Esta lista tem capacidade para 10 pessoas.\n"
									+ "No momento existe(m) " + listasequencial.tamanho + " posição(ões) preenchida(s).\n"
									+ "Digite 0 para inserir no final ou defina a posição (1-10): ");
							posicao = Integer.parseInt(entrada.next());
							
							System.out.println("Digite o nome da pessoa a ser inserida na lista sequencial: ");
							novaPessoa.nome = entrada.next();
							
							if (posicao == 0) {
								resposta = listasequencial.inserirPessoa(listasequencial.tamanho + 1, novaPessoa);
							} else {
								resposta = listasequencial.inserirPessoa(posicao, novaPessoa);
							}
							
							if(resposta) {
								System.out.println("Contato inserido com sucesso!\n");
							} else {
								System.out.println("Posição inválida, escolha outra.\n");
							}
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						
						case 2: 
							System.out.println("Gostaria de remover a pessoa presente em que posição? ");
							posicao = Integer.parseInt(entrada.next());
							listasequencial.removerContato(posicao);
							continue;
						
						case 3: 
							listasequencial.exibirLista();
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						
						case 4: 
							System.out.println("Retornando para o menu principal...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							break;
					}
				}
				break;
			
			case 2:
				int opcaoListaEncadeada = -1;
				while(opcaoListaEncadeada != 4) {
					int posicao = -1;
					PessoaEncadeada novaPessoa = new PessoaEncadeada();
					System.out.println("======================\n"
							+ "|  LISTA ENCADEADA   |\n"
							+ "======================");
					System.out.println("Selecione uma operação:\n"
							+ "1 - Inserir nome na lista encadeada.\n"
							+ "2 - Remover nome da lista encadeada.\n"
							+ "3 - Exibir nomes cadastrados na lista encadeada.\n"
							+ "4 - Voltar ao menu anterior.\n");
					opcaoListaEncadeada = Integer.parseInt(entrada.next());
							
					switch (opcaoListaEncadeada) {

						case 1: 
							System.out.println("Onde você quer inserir esta pessoa?\n"
									+ "1 - Início.\n"
									+ "2 - Fim.");
							posicao = Integer.parseInt(entrada.next());
							
							System.out.println("Que nome gostaria de inserir na lista encadeada?");
							novaPessoa.nome = entrada.next();
							
							if (posicao == 1) {
								listaencadeada.inserirAlunoInicio(novaPessoa);
							} else if (posicao == 2) {
								listaencadeada.inserirAlunoNoFim(novaPessoa);
							}
							System.out.println("Nome inserido.\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 2: 
							System.out.println("Digite o nome da pessoa que gostaria de remover da lista encadeada: ");
							listaencadeada.removerAlunoPorNome(entrada.next());
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 3: 
							listaencadeada.exibirLista();
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 4: 
							System.out.println("Retornando para o menu principal...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							break;
				}
			}
				break;
						
			case 3:
				int opcaoPilhaSequencial = -1;
				while(opcaoPilhaSequencial != 4) {
					System.out.println("======================\n"
							+ "|  PILHA SEQUENCIAL  |\n"
							+ "======================");
					System.out.println("Selecione uma operação:\n"
							+ "1 - Inserir nome na pilha sequencial.\n"
							+ "2 - Remover nome da pilha sequencial.\n"
							+ "3 - Exibir nomes cadastrados na pilha sequencial.\n"
							+ "4 - Voltar ao menu anterior.\n");
					opcaoPilhaSequencial = Integer.parseInt(entrada.next());
							
					switch (opcaoPilhaSequencial) {

						case 1: 
							System.out.println("Que nome gostaria de inserir na pilha sequencial?");
							pilhasequencial.push(entrada.next());
							System.out.println("Nome inserido.\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 2: 
							pilhasequencial.pop();
							System.out.println("Removendo a pessoa do topo da pilha sequencial...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 3: 
							pilhasequencial.exibirElementos();
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 4: 
							System.out.println("Retornando para o menu principal...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							break;
				}
			}
				break;
			case 4:
				int opcaoPilhaEncadeada = -1;
				PessoaPilhaEncadeada novaPessoaPilha = new PessoaPilhaEncadeada();
				while(opcaoPilhaEncadeada != 4) {
					System.out.println("======================\n"
							+ "|  PILHA ENCADEADA   |\n"
							+ "======================");
					System.out.println("Selecione uma operação:\n"
							+ "1 - Inserir nome na pilha encadeada.\n"
							+ "2 - Remover nome da pilha encadeada.\n"
							+ "3 - Exibir nomes da pilha encadeada.\n"
							+ "4 - Voltar ao menu anterior.\n");
					opcaoPilhaEncadeada = Integer.parseInt(entrada.next());
							
					switch (opcaoPilhaEncadeada) {

						case 1: 
							System.out.println("Que nome gostaria de inserir na pilha encadeada?");
							novaPessoaPilha.setNome(entrada.next());
							pilhaencadeada.push(novaPessoaPilha);
							System.out.println("Nome inserido.\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 2: 
							pilhaencadeada.pop();
							System.out.println("Removendo a pessoa do topo da pilha encadeada...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 3: 
							pilhaencadeada.exibirPessoas();
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							continue;
						case 4: 
							System.out.println("Retornando para o menu principal...\n");
							TimeUnit.SECONDS.sleep(tempoSleepDaNavegacao);
							break;
				}
			}
				break;
			case 0:
				break;
			}
		}
		entrada.close();
		System.out.println("PROGRAMA ENCERRADO.");
	}
}
