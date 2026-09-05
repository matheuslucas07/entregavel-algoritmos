public class Fibonacci {

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

    public static void main(String[] args) {
        System.out.println("--- Fibonacci ---");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
