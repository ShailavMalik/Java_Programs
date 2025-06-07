//* */ program to find sum of first n natural numbers
import java.util.Scanner;

public class p1_Sum_of_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0; // initializing sum to 0
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " numbers is " + sum);

        sc.close();

    }

}