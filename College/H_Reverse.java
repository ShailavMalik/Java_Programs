public class H_Reverse {

    static int rev = 0;

    public static int reverse(int n) { // 123
        if (n == 0)
            return rev;
        int r = n % 10;
        rev = rev * 10 + r;
        reverse((n / 10));
        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverse(12345));

    }

}
