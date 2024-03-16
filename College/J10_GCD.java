public class J10_GCD {

    public static int findGCD(int n1, int n2) {
        int hcf = 1;
        int num = Math.min(n1, n2);
        for (int i = 2; i <= num; i++) {
            if ((n1 % i == 0) && (n2 % i == 0))
                hcf = i;
        }
        return hcf;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(6,27));

    }

}
