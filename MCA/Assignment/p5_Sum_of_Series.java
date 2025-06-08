//* program prints the sum of the given series 
//* S = 1 - x + x^2/2 + x^3/3 + x^4/4 + ... + x^n/n

import java.util.Scanner;

public class p5_Sum_of_Series {
    static double sumOfSeries(float x, int n) {
        float sum = 1;
        int s = -1;
        for (int i = 1; i <= n; i++) {
            sum += s * Math.pow(x, i) / i;
            s = 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of constant x & n respectively: ");
        float x = sc.nextFloat();
        int n = sc.nextInt();
        System.out.printf("Sum of the Series is %.4f", sumOfSeries(x, n));
        sc.close();

    }

}
