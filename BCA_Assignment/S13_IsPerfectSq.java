import java.util.Scanner;

public class S13_IsPerfectSq {

    public static boolean isPerfect(int num) {
        if (Math.sqrt(num) == Math.floor(Math.sqrt(num)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPerfect(n));

    }

}
