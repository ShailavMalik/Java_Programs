public class I9_Swap {

    public static void main(String[] args) {
        int a = 9, b = 4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + ", b = " + b);

    }
}
