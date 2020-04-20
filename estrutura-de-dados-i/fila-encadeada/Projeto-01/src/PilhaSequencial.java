
public class PilhaSequencial {
	String	elementos[] = new String[10];
	int		topo = -1;
	
	public boolean estaVazia() {
		return (topo == -1);
	}
	
	public int quantidadeElementos( ) {
		return (topo+1);
	}
	
	public boolean estaCheia() {
		return (topo == elementos.length - 1);
	}
	
	public String top() {
		if (estaVazia())
			return null;
		
		return elementos[topo];
	}
	
	public String pop() {
		if (estaVazia())
			return null;
		String valor = elementos[topo];
		elementos[topo] = null;
		topo--;
		return valor;
	}
	
	public void push(String valor) {
		if (estaCheia())
			return;
		
		topo++;
		elementos[topo] = valor;
	}
	
	public void exibirElementos() {
		if (topo < 0) {
			System.out.println("A pilha no momento está fazia.\n");
		} else {
			for (int i = 0; i <= topo; i++)
				System.out.println((i+1)+"ª pessoa: " + elementos[i] + "\n");
		}
		
		
	}
}
