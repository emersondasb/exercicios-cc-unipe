public class Piramide {
    public static void main(String[] args) {

        String lista = "51 98 12 31 09 21 20 77 65 10";

        // quebra String nos espaços e armazena em arrayLista
        String[] arrayLista = lista.split(" ");

        // converte array de String em array de int e armazena em numeros
        int[] numeros = new int[arrayLista.length];
        for (int i = 0; i < arrayLista.length; i++) {
            numeros[i] = Integer.parseInt(arrayLista[i]);
        }

        // laço que itera por cada elemento do array numeros
        int nivel = 1, soma = 0;
        for (int i = 0; i < numeros.length;) {

            // guarda o menor valor da linha
            int menor = numeros[i];

            // imprime o(s) número(s) na linha até o máximo para cada nível da pirâmide
            for (int j = 0; j < nivel; j++, i++) {
                System.out.printf("%02d ", numeros[i]);

                // testa se o último número impresso é o menor da linha
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            nivel++;
            soma += menor;
            System.out.println();
        }

        // imprime o valor da soma dos menores valores
        System.out.println("\n" + "A soma dos menores valores de cada linha é " + soma + "\n\n");
    }
}
