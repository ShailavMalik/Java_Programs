//* */ program prints a pyramid pattern using loops as given
//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;

public class p10_Print_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // loop for spaces before pyramid
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
