package Exp2;

import java.util.Scanner;

public class Selection_Sort {
    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of ELEMENTS: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        selection_sort(arr, n);
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
