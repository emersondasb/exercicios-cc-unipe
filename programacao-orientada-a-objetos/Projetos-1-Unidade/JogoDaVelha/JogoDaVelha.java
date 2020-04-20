import java.util.Scanner;

public class JogoDaVelha {

    // Mostra no console uma mensagem de início do jogo e símbolos de cada jogador
    static void abertura() {
        System.out.println("   ");
        System.out.println("\nBem-vindo ao clássico Jogo da Velha!");
        System.out.println("O jogador 1 será 'X' e o jogador 2 será 'O'");
        System.out.println("Tecle ENTER para começar!");
    }

    // Retorna 1 ou 2 dependendo do jogador da vez
    static int jogadorDaVez(int jogadas) {
        int jogador;
        if (jogadas % 2 == 0) {
            jogador = 1;
        } else {
            jogador = 2;
        }
        return jogador;
    }

    // Retorna 0 se não há vencedor, ou 1 ou 2 dependendo do jogador vencedor
    static int verificaSeHaVencedor(int[][] tabuleiro) {
        int vencedor = 0;
        for (int i = 1; i < 3; i++) {
            if ((tabuleiro[0][0] == i && tabuleiro[0][1] == i && tabuleiro[0][2] == i)
                    || (tabuleiro[1][0] == i && tabuleiro[1][1] == i && tabuleiro[1][2] == i)
                    || (tabuleiro[2][0] == i && tabuleiro[2][1] == i && tabuleiro[2][2] == i)
                    || (tabuleiro[0][0] == i && tabuleiro[1][0] == i && tabuleiro[2][0] == i)
                    || (tabuleiro[0][1] == i && tabuleiro[1][1] == i && tabuleiro[2][1] == i)
                    || (tabuleiro[0][2] == i && tabuleiro[1][2] == i && tabuleiro[2][2] == i)
                    || (tabuleiro[0][0] == i && tabuleiro[1][1] == i && tabuleiro[2][2] == i)
                    || (tabuleiro[0][2] == i && tabuleiro[1][1] == i && tabuleiro[2][0] == i)) {
                vencedor = i;
            }
        }
        return vencedor;
    }

    // Exibe no console como está o tabuleiro no momento em que o método é chamado
    static void motraTabuleiro(int[][] tabuleiro) {
        System.out.println();
        System.out.printf("    C%d  C%d  C%d\n\n", 1, 2, 3);
        for (int i = 0; i < 3; i++) {
            System.out.printf("L%d  ", i + 1);
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    System.out.printf(" %s  ", "-");
                }
                if (tabuleiro[i][j] == 1) {
                    System.out.printf(" %s  ", "X");
                }
                if (tabuleiro[i][j] == 2) {
                    System.out.printf(" %s  ", "O");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Retorna true ou false dependendo se for uma jogadas válida ou não
    static boolean jogadasPermitida(int[][] tabuleiro, int linha, int coluna) {
        boolean permitida = false;
        if ((linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2)) {
            if (tabuleiro[linha][coluna] == 0) {
                permitida = true;
            }
        }
        return permitida;
    }

    // Exibe mensagem de fim de jogo indicando o jogador vencedor
    static void fimDeJogo(int[][] tabuleiro) {
        motraTabuleiro(tabuleiro);
        if (verificaSeHaVencedor(tabuleiro) == 1) {
            System.out.println("PARABÉNS! O jogador 1 'X' é o vencedor!\n\n");
        } else if (verificaSeHaVencedor(tabuleiro) == 2) {
            System.out.println("PARABÉNS! O jogador 2 'O' é o vencedor!\n\n");
        } else {
            System.out.println("EMPATE! Joguem mais uma vez...\n\n");
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linha, coluna, jogadas = 0;
        int[][] tabuleiro = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

        abertura();
        entrada.nextLine();

        while (verificaSeHaVencedor(tabuleiro) == 0 && jogadas < 9) {

            motraTabuleiro(tabuleiro);

            if (jogadorDaVez(jogadas) == 1) {
                System.out.println("== Vez do jogador número 1 'X' ==\n");
            } else {
                System.out.println("== Vez do jogador número 2 'O' ==\n");
            }

            System.out.println("Digite a LINHA que gostaria de jogar: ");
            linha = Integer.parseInt(entrada.next());
            System.out.println("Digite a COLUNA que gostaria de jogar: ");
            coluna = Integer.parseInt(entrada.next());

            if (jogadasPermitida(tabuleiro, linha - 1, coluna - 1)) {
                tabuleiro[linha - 1][coluna - 1] = jogadorDaVez(jogadas);
                jogadas++;
            } else {
                System.out.println("\nEsta jogada não é permitida! Jogue em outra posição.");
                continue;
            }
        }
        entrada.close();
        fimDeJogo(tabuleiro);

    }
}