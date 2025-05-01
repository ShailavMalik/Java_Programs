import java.util.Scanner;


class S1_Fibonacci {
    // print first n fibonacci numbers
    static void printFib(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        myobj.close();
        printFib(n);
    }
}