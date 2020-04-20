
public class ListaSequencial extends PessoaSequencial {
	
	PessoaSequencial[] pessoas = new PessoaSequencial[10];
	int tamanho = 0;
	
	public boolean estaVazia() {
		return(tamanho == 0);
	}
	
	public boolean estaCheia() {
		return(tamanho == pessoas.length);
	}
	
	public int tamanhoLista() {
		return(tamanho);
	}
	
	public PessoaSequencial buscar(int pos) {
		// verifica se pos e valida
		if (pos < 0 || pos >= tamanho)
			return null;
		
		return pessoas[pos];
	}
	
	public boolean Compara(PessoaSequencial c1, PessoaSequencial c2) {
		return(c1.nome.equals(c2.nome));
	}
	
	public int retornarPosicao(PessoaSequencial contato) {
		for (int i = 0; i <= tamanho; i++)
			if (Compara(pessoas[i], contato))
				return i;
		return -1;
	}
	
	public void deslocarParaDireita(int pos) {
		for (int i = tamanho; i > pos; i--)
			pessoas[i] = pessoas[i - 1];
	}
	
	public boolean inserirPessoa (int pos, PessoaSequencial c1) {
		pos -= 1;
		if (estaCheia() || (pos > tamanho) || (pos < 0))
			return false;
		deslocarParaDireita(pos);
		pessoas[pos] = c1;
		tamanho++;
		return true;
	}
	
	public void deslocarParaEsquerda(int pos) {
		for (int i = pos; i < (tamanho - 1); i++)
			pessoas[i] = pessoas[i + 1];
	}
	
	public boolean removerContato (int pos) {
		if ((pos > tamanho) || (pos < 0))
			return false;
		deslocarParaEsquerda(pos);
		tamanho--;
		return true;
	}
	
	public void exibirLista() {
		if (tamanho == 0) {
			System.out.println("A lista sequencial no momento está vazia!\n");
		} else {
			for (int i = 0; i < tamanho; i++)
				System.out.println(	"\nPosição: " + (i + 1)
									+"\nNome: " +pessoas[i].nome + "\n");
		}
		
	}
}

