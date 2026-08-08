package ARRAY;
import java.util.*;
public class BinarySearch {
    public static int Search(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comprasion
            if (numbers[mid] == key){ // right
                return mid;
            }
            if (numbers[mid] < key){
                start = mid + 1;
            }else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 14;
        System.out.println("index for key is  : "+ Search(numbers,key));
    }
}
