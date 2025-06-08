
//* program that generates a mathematical Fibonacci series using a loop.   */
import java.util.Scanner;

class Fibnonacci {
    void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}

public class p4_Print_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        Fibnonacci f = new Fibnonacci();
        f.printFibonacci(n);
        sc.close();
    }

}
