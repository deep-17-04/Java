package Recursion;

public class CheckPrime {

    static boolean isPrime(int n, int i) {
        if (n == 2) return true;
        if (n % i == 0) return false;

        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPrime(n, 2));
    }
}
