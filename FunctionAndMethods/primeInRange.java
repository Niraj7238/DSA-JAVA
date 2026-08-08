package FunctionAndMethods;

public class primeInRange {
    public static boolean isPrime(int n ){
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0){ // completely devideing
                return false;

            }
        }
        return true;
    }


    public static void primeRange(int n){
        for(int i = 1; i<=n; i++){
            if(isPrime(i)){ // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static boolean isPr(int n){
        if (n == 2){
            return true;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeRange(100);
    }
}
