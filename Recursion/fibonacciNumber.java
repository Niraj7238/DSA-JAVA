package Recursion;

public class fibonacciNumber {

    public static int fib(int n ){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1); // fnm1-----> fibonacii of (n-1)
        int fnm2 = fib(n-2); // fnm2-----> fibonacii of (n-2)
        int fn = fnm1 + fnm2;
        return fn;
    }


    public static void main(String[] args) {
        int n = 8; // n = position name
        System.out.println(fib(n));
    }
}
