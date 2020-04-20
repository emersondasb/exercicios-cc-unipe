
public class PilhaEncadeada {
	PessoaPilhaEncadeada topo;
	int		quantidade = 0;
	
	public boolean estaVazia() {
		return (topo == null);
	}
	
	public int quantidadeElementos() {
		return quantidade;
	}
	
	public PessoaPilhaEncadeada top () {
		if (estaVazia())
			return null;
		
		return (topo);
	}
	
	public void push(PessoaPilhaEncadeada a) {
		a.proximo = topo;
		topo = a;
		quantidade++;
	}
	
	public PessoaPilhaEncadeada pop () {
		if (estaVazia())
			return null;
			
		PessoaPilhaEncadeada aux = topo;
		topo = topo.proximo;
		quantidade--;
		return aux;
	}
	
	public void exibirPessoas () {
		if (estaVazia()) {
			System.out.println("A pilha encadeada está vazia.\n");
			return;
		} else {
			PessoaPilhaEncadeada aux = topo;
			for (int i = 0; i < quantidade; i++) {
				System.out.println((i+1)+"ª pessoa: " + aux.getNome());
				aux = aux.proximo;
			}
		}
		System.out.println("");
	}
}
