package replIt;
import java.util.Arrays;
/*
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.
 */

public class Assessment_4 {
    public static boolean isSort(int[] nums)
    {
        int[] copy = new int [nums.length];

        for(int i = 0; i < nums.length; i++){
            copy [i] = nums [i];

        }

        Arrays.sort(nums);

        boolean result = Arrays.equals(nums, copy);

        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        int [] arr = {2,3,5,4,9};
        isSort(arr);
    }
}
