import java.util.Arrays;

public class Quicksort {

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

    public static void main(String[] args) {
        System.out.println("--- Quicksort ---");
        int[] desordenado = {5, 3, 8, 1, 9, 2};
        quicksort(desordenado, 0, desordenado.length - 1);
        System.out.println("Ordenado: " + Arrays.toString(desordenado));
    }
}
