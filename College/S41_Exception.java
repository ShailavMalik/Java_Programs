import java.util.Scanner;

public class S41_Exception {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        try {
            System.out.print("Enter array index: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            System.out.println(arr[n]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter a valid index no ");

        }
    }

}