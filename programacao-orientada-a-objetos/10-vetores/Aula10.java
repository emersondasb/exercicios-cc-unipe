
//import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        int[] vetor1 = new int[3];
        vetor1[0] = 2;
        vetor1[1] = 4;
        vetor1[1] = 8;

        // Uma forma alternavida ao que está acima:
        int[] vetor2 = { 2, 4, 8 };

        for (int i = 0; i < vetor2.length; i++) {

            System.out.println(vetor2[i]);
        }
    }
}