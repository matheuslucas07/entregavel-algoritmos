public class EhPrimo {

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Número primo ---");
        System.out.println("17 é primo? " + ehPrimo(17));
    }
}
