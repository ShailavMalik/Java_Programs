//* program that demonstrates exception handling using try, catch, and 

import java.util.Scanner;

public class p21_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.print("Enter an index to access the array (0-4): ");
            int index = sc.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds!");
        } catch (Exception e) { // Catching any other exceptions that may occur
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally { // This block always executes whether an exception occurs or not
            System.out.println("\nFinally block executed.");
            sc.close();
            System.out.println("Scanner closed.");
        }

    }
}
