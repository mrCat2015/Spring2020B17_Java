package replIt;
/*
Given an int array of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Front_Piece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] arr = new int[1];


             if (size < 2) {
                 arr = new int[1];
                 arr[0] = num[0];
                // arr[1] = num[1];

        }else{
                 arr = new int [2];
                 arr[0] = num[0];
                 arr[1] = num[1];
                // arr[2] = num[2];


             }
        System.out.println(Arrays.toString(arr));
    }
}
