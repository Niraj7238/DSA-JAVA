package SortingAlgo;

public class InsertionTech {

    public static void insertionSorting(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i];
            int prev = i - 1;

            // Finding the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert current element
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

        int arr[] = {200, 500, 100, 300, 400};

        insertionSorting(arr);
        printArr(arr);
    }
}