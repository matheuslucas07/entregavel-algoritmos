public class Somatorio {

    public static int somatorio(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("--- Somatório ---");
        System.out.println("Somatório de [1,2,3,4,5] = " + somatorio(new int[]{1, 2, 3, 4, 5}));
    }
}
