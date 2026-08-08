package ARRAY;

public class LargestNum {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infity

        for (int i=0; i<numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,34,5};
        System.out.println("larrgest value is : " + getLargest(numbers));


    }
}
