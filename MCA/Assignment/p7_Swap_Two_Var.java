// * program swaps two numbers without using a third variable.

public class p7_Swap_Two_Var {

    public static void main(String[] args) {
        int num1 = 83;
        int num2 = 5;
        System.out.println("Initially,\n num1 = " + num1 + " num2 = " + num2 + "\n");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap,\n num1 = " + num1 + " num2 = " + num2 + "\n");
    }

}
