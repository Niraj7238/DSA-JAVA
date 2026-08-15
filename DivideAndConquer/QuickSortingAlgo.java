package DivideAndConquer;

public class QuickSortingAlgo {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // partition
        int pIdx = partition(arr, si, ei);

        // left
        quickSort(arr, si, pIdx - 1);

        // right
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        // last element as pivot
        int pivot = arr[ei];

        // place for smaller elements
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {

                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // place pivot at correct position
        i++;

        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}