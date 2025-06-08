//* */ program demonstrating various operations on a 1D array, including: 
//* */ • Input elements 
//* */ • Display elements 
//* */ • Find the sum of elements 
//* */ • Find the largest and smallest elements 
//* */ • Reverse the array 
//* */ • Search for an element 
//* */ • Delete an element 

import java.util.Scanner;

class arrayUtil {
    int arr[];
    int n;

    arrayUtil(int arr[], int n) {
        this.arr = arr;
        this.n = n;
    }

    void readArray() {
        // randomly fill array elements with values 1 to 100
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    void printArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    int arraySum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int[] findMinMax() {
        int max_indx = 0;
        int min_indx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[min_indx] > arr[i])
                min_indx = i;
            if (arr[max_indx] < arr[i])
                max_indx = i;
        }
        return new int[] { arr[min_indx], arr[max_indx] };
    }

    void reverseArray() {
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            // swap arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int searchArray(int target) {
        int target_indx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                target_indx = i;
        }

        return target_indx;
    }

    void deleteElm(int del_elm) {
        // find del_indx
        int del_indx = searchArray(del_elm);
        if (del_indx == -1) {
            System.out.println("Element doesn't present in the array");
            return;
        }
        for (int i = del_indx; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // reduce size of array by 1
    }

}

public class p12_1D_Array_Opr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arrayUtil u1 = new arrayUtil(arr, n);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Read Array");
            System.out.println("2. Print Array");
            System.out.println("3. Find Sum");
            System.out.println("4. Find Min/Max");
            System.out.println("5. Reverse Array");
            System.out.println("6. Search Element");
            System.out.println("7. Delete Element");
            System.out.println("8. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    u1.readArray();
                    break;
                case 2:
                    u1.printArray();
                    break;
                case 3:
                    System.out.println("Sum of Elements = " + u1.arraySum());
                    break;
                case 4:
                    int[] minMax = u1.findMinMax();
                    System.out.println("Min Element = " + minMax[0] + " & Max Element = " + minMax[1]);
                    break;
                case 5:
                    u1.reverseArray();
                    System.out.println("Array Reversed:");
                    u1.printArray();
                    break;
                case 6:
                    System.out.print("Enter the element to searched: ");
                    int target = sc.nextInt();
                    int target_indx = u1.searchArray(target);
                    if (target_indx != -1)
                        System.out.println(target + " is present in Array at index " + target_indx);
                    else {
                        System.out.println(target + " is not present in Array");
                    }
                    break;
                case 7:
                    System.out.print("Enter the element to be deleted: ");
                    int del_elm = sc.nextInt();
                    u1.deleteElm(del_elm);
                    System.out.println("Array after deletion:");
                    u1.printArray();
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return; // exit the program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
