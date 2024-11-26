
package topic_6_sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the array length
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array and take user input for each element
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("Original array:");
        printArray(arr);

        // Sort the array using bubble sort
        bubbleSort(arr);

        // Display the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        // Close the scanner
        scanner.close();
    }
}

