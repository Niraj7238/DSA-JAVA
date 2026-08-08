package PatternsProblems;

public class invertedStar {
    public static void main(String[] args) {
        int n = 8 ;
        for(int line = 1; line <=n; line++){
            for (int star = 1; star<= n-line+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
