package Recursion;

public class PowerXtoN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
//        int xnm1 = power(x, n - 1);    // xnm1 ---> x to the power n -1
//        int xn = x * xnm1;  // xn ----> x to the power one
//        return xn;


        return x * power(x,n-1);
    }


    public static void main(String[] args) {
            System.out.println(power(2,10));
    }
}
