
//*  program to create a simple calculator using packages.
import calculator.Calculator;
import java.util.Scanner;

public class p17_Calculator_Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();
            
            switch (choice) {
                case 1:
                    System.out.println("Addition: " + calc.add(a, b) + "\n");
                    break;
                case 2:
                    System.out.println("Subtraction: " + calc.subtract(a, b) + "\n");
                    break;
                case 3:
                    System.out.println("Multiplication: " + calc.multiply(a, b) + "\n");
                    break;
                case 4:
                    System.out.println("Division: " + calc.divide(a, b) + "\n");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
