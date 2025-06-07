//* */ program that takes six numbers as input and finds the greatest & smallest among them. 

import java.util.Scanner;

public class p3_Smallest_of_6 {

    static int findMin(int arr[], int n) {
        int min_indx = 0; // Initialize with the first element
        // Find the index of the minimum element
        for (int i = 1; i < n; i++) {
            if (arr[min_indx] > arr[i])
                min_indx = i;
        }
        return arr[min_indx];
    }

    static int findMax(int arr[], int n) {
        int max_indx = 0; // Initialize with the first element
        // Find the index of the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[max_indx] < arr[i])
                max_indx = i;
        }
        return arr[max_indx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter six numbers: ");
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum no is " + findMax(arr, n) + " & Minimum is " + findMin(arr, n));

        sc.close();

    }
}
