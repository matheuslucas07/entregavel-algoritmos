import java.util.Arrays;

public class Algoritmos {

    // 1. Número é primo
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Somatório
    public static int somatorio(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    // 3. Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int anterior = 0, atual = 1;
        for (int i = 2; i <= n; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }

    // 4. Máximo divisor comum
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    // 5. Ordenação (Quicksort)
    public static void quicksort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int p = particiona(arr, inicio, fim);
            quicksort(arr, inicio, p - 1);
            quicksort(arr, p + 1, fim);
        }
    }

    public static int particiona(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }

    // 6. Contagem
    public static int contagem(int primeiro, int n) {
        int contador = 0;
        for (int i = primeiro; i <= n; i++) {
            contador++;
        }
        return contador;
    }

    // ---- Testes ----
    public static void main(String[] args) {
        System.out.println("--- Número primo ---");
        System.out.println("17 é primo? " + ehPrimo(17));

        System.out.println("--- Somatório ---");
        System.out.println("Somatório de [1,2,3,4,5] = " + somatorio(new int[]{1, 2, 3, 4, 5}));

        System.out.println("--- Fibonacci ---");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }

        System.out.println("--- MDC ---");
        System.out.println("MDC(48, 18) = " + mdc(48, 18));

        System.out.println("--- Quicksort ---");
        int[] desordenado = {5, 3, 8, 1, 9, 2};
        quicksort(desordenado, 0, desordenado.length - 1);
        System.out.println("Ordenado: " + Arrays.toString(desordenado));

        System.out.println("--- Contagem ---");
        System.out.println("Quantidade de inteiros entre 1 e 10: " + contagem(1, 10));
    }
}