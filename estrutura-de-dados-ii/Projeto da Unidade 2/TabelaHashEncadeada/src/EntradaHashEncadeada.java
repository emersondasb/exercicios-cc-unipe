public class EntradaHashEncadeada {
	
    private int matricula;
    private String nome;
    private int idade;
    private EntradaHashEncadeada proximo;

    EntradaHashEncadeada(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.proximo = null;
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EntradaHashEncadeada getProximo() {
		return proximo;
	}

	public void setProximo(EntradaHashEncadeada proximo) {
		this.proximo = proximo;
	}

}
