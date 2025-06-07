
// * program to find LCM of three numbers
import java.util.Scanner;

public class p2_LCM_of_3_Num {

    // Function to find LCM of two numbers
    static int findLCM(int a, int b) {

        int num1, num2;
        // num1 is the smaller number and num2 is the larger number
        if (a < b) {
            num1 = a;
            num2 = b;
        } else {
            num1 = b;
            num2 = a;
        }
        int lcm = num2;
        // LCM is smallest multiple of num2 that is divisible by num1
        for (int i = 1; i <= num1; i++) {
            int temp = num2 * i;
            if (temp % num1 == 0) {
                lcm = temp;
                break;
            }
        }
        return lcm;
    }

    // Function to find LCM of three numbers
    static int findLCM(int a, int b, int c) {
        return findLCM(findLCM(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int lcm = findLCM(n1, n2, n3);
        // LCM of three numbers is LCM of LCM of first two numbers and third number

        System.out.println("LCM of " + n1 + " " + n2 + " " + n3 + " is " + lcm);
        sc.close();

    }

}
