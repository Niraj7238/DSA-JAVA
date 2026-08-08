package ARRAY;
import java.util.*;

public class LargestSmallest {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infity
        int smallest = Integer.MAX_VALUE;// +infity

        for (int i=0; i<numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is  :"+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,-34,5};
        System.out.println("larrgest value is : " + getLargest(numbers));


    }
}
