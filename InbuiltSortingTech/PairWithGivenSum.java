package InbuiltSortingTech;
import java.util.Arrays;

public class PairWithGivenSum {
    public static void findPair(int arr[], int target){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;

            }
            else {
                right--;
            }
        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,3,4};
        int target = 9;
        findPair(arr,target);

    }
}
