public class ListaEncadeada extends PessoaEncadeada {
	PessoaEncadeada primeiro = null;
	PessoaEncadeada ultimo = null;
	int tamanho = 0;
	
	public boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}
	
	public void inserirAlunoInicio (PessoaEncadeada a) {
		if (estaVazia()) {
			primeiro  = ultimo = a;
		}
		else {
			a.proximo = primeiro;
			primeiro = a;
		}
		tamanho++;
	}
	
	public void inserirAlunoNoFim (PessoaEncadeada a) {
		if (estaVazia()) {
			primeiro = ultimo = a;
		}
		else {
			ultimo.proximo = a;
			ultimo = a;
		}
		tamanho++;
	}
	
	public void exibirLista() {
		PessoaEncadeada temp = primeiro;
		
		if (tamanho == 0) {
			System.out.println("A lista no momento está vazia.\n");
		} else {
			for (int i = 0; i < tamanho; i++) {
				System.out.println("Pessoa: "+ (i+1) +"\nNome: " + temp.nome + "\n");
				temp = temp.proximo;
			}
			System.out.println("");
		}
		
	}
	
	public int tamanhoDaLista() {
		return tamanho;
	}
	
	public void removerAlunoPorNome (String nomeprocurado) {
		// caso da lista estar vazia
		if (estaVazia()) {
			System.out.println("A lista esta vazia e não tem o que remover.");
			return;
		}
		
		// caso de ter somente um elemento
		if (tamanho == 1) {
			if (primeiro.nome.contentEquals(nomeprocurado)) {
				primeiro = ultimo = null;
				tamanho--;
				return;
			}
			else {
				System.out.println("O nome "+nomeprocurado+" procurado não está na lista.");
				return;
			}
		}
		// caso a lista tenha mais de um elemento
		PessoaEncadeada alunofrente = primeiro;
		PessoaEncadeada alunotras = null;
		
		for (int i = 0; i < tamanho; i++) {
			if (nomeprocurado.contentEquals(alunofrente.nome)) {
				// se o nome encontrado está na primeira posição
				if (i == 0) {
					System.out.println("Achei o nome na primeira posição da lista");
					primeiro = primeiro.proximo;
					tamanho--;
					return;
				}
				else {
					alunotras.proximo = alunofrente.proximo;
					tamanho--;
					return;
				}
			}
			// caso não encontre o nome vai caminhando pela lista para o próximo nó
			else {
				System.out.println("Procurando e removendo...\n");
				alunotras = alunofrente;
				alunofrente = alunofrente.proximo;
			}
		}
	}
}

