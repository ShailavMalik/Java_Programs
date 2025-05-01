import java.util.Scanner;

public class S43_Multiple_catch {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        try {
            System.out.print("Enter array index: ");
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            sc.close();
            System.out.println(arr[n]);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.toString());
        }
        

    }
}
