
// * program to check if a character is vowel or consonent
import java.util.Scanner;

public class p6_Vowel_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vowel[] = { 'a', 'i', 'o', 'u', 'e', 'A', 'I', 'O', 'U', 'E' };
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        Boolean vowelFlag = false;
        for (int i : vowel) {
            if (ch == i)
                vowelFlag = true;
        }
        if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
            System.out.println("Invalid input. Please enter an alphabetic character.");
        } else if (vowelFlag) {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }

        sc.close();
    }
}
