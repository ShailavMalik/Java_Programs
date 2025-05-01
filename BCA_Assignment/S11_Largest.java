public class S11_Largest {
    public static int largestOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;

        else {
            return c;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(largestOfThree(2,6,8));

    }

}
