package Recursion;

public class SumOfN {

    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1); // Snm1----> (sum of n -1)
        int Sn = n + Snm1; // Sn ----> sum of n
        return  Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcSum(n));
    }
}
