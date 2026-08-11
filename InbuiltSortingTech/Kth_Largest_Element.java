package InbuiltSortingTech;
import java.util.Arrays;
public class Kth_Largest_Element {

    public static int findKthLargest(int arr[] , int k ){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr,k));
    }
}
