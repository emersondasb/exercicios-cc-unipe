public class TabelaHash {

    private final static int TAMANHO = 10;
    EntradaHashEncadeada[] tabela;
    
    // tabela = [null, null, null, null, null, null, null, null, null, null]
    TabelaHash() {
        tabela = new EntradaHashEncadeada[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            tabela[i] = null;
        }
    }
    

    public void inserir(int matricula, String nome, int idade) {
        int hash = (matricula % TAMANHO);
        if (tabela[hash] == null) {
            tabela[hash] = new EntradaHashEncadeada(matricula, nome, idade);
        }
        else {
            EntradaHashEncadeada entrada = tabela[hash];
            while (entrada.getProximo() != null && entrada.getMatricula() != matricula) {
                entrada = entrada.getProximo();
            }
            if (entrada.getMatricula() == matricula) {
                entrada.setNome(nome);
                entrada.setIdade(idade);
            }
            else {
                entrada.setProximo(new EntradaHashEncadeada(matricula, nome, idade));
           }
        }
    }
    
    
    public void buscar(int matricula) {
        int hash = (matricula % TAMANHO);
        if (tabela[hash] == null) {
            System.out.println("Aluno não encontrado!");
        }
        else {
            EntradaHashEncadeada entrada = tabela[hash];
            while (entrada != null && entrada.getMatricula() != matricula) {
                entrada = entrada.getProximo();
            }
            if (entrada == null) {
            	System.out.println("Aluno: Não encontrado!");
            }
            else {
            	System.out.println("Aluno: " + entrada.getNome() + " (" + entrada.getIdade() + " anos)"); ;
            }
        }
    }
    

    public void remover(int matricula) {
        int hash = (matricula % TAMANHO);
        if (tabela[hash] != null) {
            EntradaHashEncadeada entradaAnterior = null;
            EntradaHashEncadeada entrada = tabela[hash];
            while (entrada.getProximo() != null && entrada.getMatricula() != matricula) {
                entradaAnterior = entrada;
                entrada = entrada.getProximo();
            }

            if (entrada.getMatricula() == matricula) {
                if (entradaAnterior == null) {
                    tabela[hash] = entrada.getProximo();
                }
                else {
                    entradaAnterior.setProximo(entrada.getProximo());
                }
            }
        }
    }
    

    public void exibir() {
    	for (int i = 0; i < TAMANHO; i++) {
                        
            EntradaHashEncadeada entrada = tabela[i];
            while (entrada != null) {                
                System.out.println("Aluno: " + entrada.getNome() + " (" + entrada.getIdade() + " anos)");
                entrada = entrada.getProximo();
            }
        }
    }
}
