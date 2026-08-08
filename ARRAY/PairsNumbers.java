package ARRAY;

public class PairsNumbers {
    public static void printPairs(int numbers[]){
        int tp = 0;  // totals pairs = tp
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i]; // 2,4,6,8,10
            for(int j =i+1; j<numbers.length; j++){
                System.out.print("("+ curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    static void main(String[] args) {
        int number[] = {2 , 4 , 6, 8, 10};
        printPairs(number);

    }
}
