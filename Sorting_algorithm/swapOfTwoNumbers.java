package Sorting_algorithm;

import java.util.Scanner;

public class swapOfTwoNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int b = sc.nextInt();


        System.out.println("Before swapping :");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);

        int temp = a;
        a = b;
        b = temp;  // temporary verable

        System.out.println("After swapping ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }
}
