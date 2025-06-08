
//* program to print the multiplication table of a given number  */  
import java.util.Scanner;

public class p8_Multiplication_table {

    static void generateTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        generateTable(n);
        sc.close();
    }

}
