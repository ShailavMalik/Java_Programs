
// * program that performs addition & multiplication of two 2D arrays
import java.util.Scanner;

public class p13_Matrix_Add_Mul {
    static void printArray(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void matrixAdd(int arr1[][], int arr2[][], int res[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    static void matrixMul(int arr1[][], int arr2[][], int res[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of m & n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int sumArray[][] = new int[m][n];
        int mulArray[][] = new int[m][n];

        // assign random elements to matrix elements (2D Array)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = (int) (Math.random() * 10); // assigning random values from 0 to 9
                arr2[i][j] = (int) (Math.random() * 10); // assigning random values from 0 to 9
            }
        }
        // printing both matrices
        System.out.println("Array1: ");
        printArray(arr1, m, n);
        System.out.println("Array2: ");
        printArray(arr2, m, n);
        // adding both arrays
        matrixAdd(arr1, arr2, sumArray, m, n);
        System.out.println("\nAdding both arrays");
        printArray(sumArray, m, n);
        // multiplying both arrays
        matrixMul(arr1, arr2, mulArray, m, n);
        System.out.println("\nMultiplying both arrays");
        printArray(mulArray, m, n);

        sc.close();
    }
}
