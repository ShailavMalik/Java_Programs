import java.lang.Math;

class E_Armstrong {

    public static boolean isArmstrong(int n) {
        // 123
        int num = n;
        double ans = 0;
        while (n != 0) {
            int r;
            r = n % 10;
            n = n / 10;
            ans = ans + Math.pow(r, 3);
        }

        if (num == (int) (ans))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print(isArmstrong(153));

    }

}
