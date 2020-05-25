package replIt;
import java.util.*;

/*
Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
Examples
missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

missingNumber([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10

missingNumber([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7
Notes
The array of numbers will be unsorted (not in order).
Only one number will be missing.
 */

public class FindTheMissingNumber {
    public static void main(String[] args) {

       int[] arr = {10, 5, 1, 2, 4, 6, 8, 3, 9};



       System.out.println(missingNumber(arr));


    }

    public static int missingNumber(int[] arr) {

        Arrays.sort(arr);
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
           int k = i+1;
                if (arr[i] != k) {
                    result = k;
                    break;
                 }

        }
        return result;
    }
}
