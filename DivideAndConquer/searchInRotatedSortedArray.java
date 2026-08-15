package DivideAndConquer;

public class searchInRotatedSortedArray {

    public static int search(int arr[], int tar, int si, int ei) {

        // base case
        if (si > ei) {
            return -1;
        }

        // mid
        int mid = si + (ei - si) / 2;

        // Case 1: target found
        if (arr[mid] == tar) {
            return mid;
        }

        // Case 2: Left half is sorted
        if (arr[si] <= arr[mid]) {

            // Target lies in left sorted half
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);

            } else {
                // Target lies in right half
                return search(arr, tar, mid + 1, ei);
            }
        }

        // Case 3: Right half is sorted
        else {

            // Target lies in right sorted half
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);

            } else {
                // Target lies in left half
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        int target = 0; // output  --> 4

        int tarIdx = search(arr, target, 0, arr.length - 1);

        System.out.println(tarIdx);
    }
}