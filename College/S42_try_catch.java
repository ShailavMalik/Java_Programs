public class S42_try_catch {

    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}