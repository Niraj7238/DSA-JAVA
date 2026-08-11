package InbuiltSortingTech;
import java.util.Arrays;

public class SecondLargestElement {
    public static int SecondLargest(int arr[]){
        Arrays.sort(arr);

        // find second largest unique element
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,20,8,20,15};
        System.out.println(SecondLargest(arr));

        // time complexity --> O(n log n)
        // space complexity --> O(1)

    }
}
