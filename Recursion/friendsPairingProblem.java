package Recursion;

public class friendsPairingProblem {
    public static int friendsParing(int n){

        if(n == 1 || n == 2){
            return n;

        }
//        // choice ----> Single or Pair
//        // Single
//        int fnm1 = friendsParing(n-1);  // fnm1 ---> f(n-1)
//
//        // Paring
//        int fnm2 = friendsParing(n-2);
//        int pairWay = (n-1) * fnm2;
//
//        // totalways
//        int totalWay = fnm1 + pairWay;
//        return totalWay;


//        one line ----> code
        return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsParing(3));

    }
}
