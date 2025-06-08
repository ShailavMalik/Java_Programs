//* */ program that takes two numbers, m and n, as input and prints all prime 
//* */ numbers between them.

import java.util.Arrays;
import java.util.Scanner;

public class p9_Primes_Between {

    // ? Sieve of Eratosthenes
    static void printPrimesBetween(int m, int n) {
        boolean[] is_prime = new boolean[n + 1];
        Arrays.fill(is_prime, true); // Initialize all numbers as prime
        is_prime[0] = is_prime[1] = false; // 0 and 1 are not prime numbers
        if (m < 2)
            m = 2; // Start from the first prime number
        for (int p = 2; p * p < n; p++) { // Check for primes up to sqrt(n)
            if (is_prime[p]) {
                for (int i = p * p; i <= n; i += p) { // Mark multiples of p as non-prime
                    is_prime[i] = false; // Start marking from p*p
                }
            }
        }
        for (int i = m; i < n; i++) {
            if (is_prime[i])
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m & n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        printPrimesBetween(m, n);
        sc.close();
    }
}
