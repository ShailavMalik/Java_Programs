import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.IndexOutOfBoundsException;
// import java.lang.*;

public class prm3_Exception {

    public static void main(String[] s) throws ArithmeticException, IndexOutOfBoundsException {

        // int[] arr = new int[3];
        // arr[0] = 00;
        // arr[1] = 10;
        // arr[2] = 20;
        int num1 = 3;
        System.out.println("Enter no greater than 0");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if (num <= 0) {
        //     throw new IndexOutOfBoundsException();
        // }

        try {

            System.out.println(num1 / num);
        }
         catch (IndexOutOfBoundsException e) {
            // System.out.println("Some error occured");
            System.out.println(e);
        }

    }

}
