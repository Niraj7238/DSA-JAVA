package ARRAY;

import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array of elements :");
        for (int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the value to remove :");
        int val = sc.nextInt();

        int k = removeElement(nums , val);
        System.out.println("Number of element after removing"+ val + " = "+ k);

        System.out.println("Update array :");
        for (int i = 0; i < k; i++){
            System.out.println(nums[i] + " ");
        }
        sc.close();


    }
}
