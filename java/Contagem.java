public class Contagem {

    public static int contagem(int primeiro, int n) {
        int contador = 0;
        for (int i = primeiro; i <= n; i++) {
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("--- Contagem ---");
        System.out.println("Quantidade de inteiros entre 1 e 10: " + contagem(1, 10));
    }
}
