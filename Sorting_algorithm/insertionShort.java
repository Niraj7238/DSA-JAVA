package Sorting_algorithm;
import java.util.Arrays;

public class insertionShort {

    public static void insertion(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i];
            int prev = i - 1;

            // Finding the correct position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert the current element
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};

        //  insertion(arr);
        Arrays.sort(arr);  // inbuilt function
        printArr(arr);
    }
}