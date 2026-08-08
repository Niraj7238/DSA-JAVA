package FunctionAndMethods;

public class Overloading_dataTypes {
    // func to cal int sum
    public static int sum(int a, int b){
        return a + b;
    }

    // func to calculate float sum
    public static float sum(float a , float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,4));
        System.out.println(sum(3.5f  , 6.5f));

    }
}
