import java.util.Scanner;

public class S12_Is_Positive {

    public static boolean isPositive(double a) {
        if (a >= 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        sc.close();
        if (isPositive(num)) {
            System.out.println("positive");
        } else
            System.out.println("Negative");

    }

}
