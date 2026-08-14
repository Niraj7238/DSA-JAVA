package Recursion;

public class TilingProblemAmazon {

    public static int tilingProblem(int n ){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }

        // kaam
        // verticle choice
        int fnm1 = tilingProblem(n-1);  // fnm1 ----> f(n-1)

        // horizontal choic
        int fnm2 = tilingProblem(n-2);  // fnm2 ----> f(n-2)

        int totalWays = fnm1 + fnm2;
        return  totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));

    }
}
