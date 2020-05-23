package Office_Hours_Saim.day4_05_23_2020;
/*

Given an array of ints,
return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class arrayFront9 {
    public static void main(String[] args) {
        int [] nums = {1,2,9,3,4};
        boolean result = false;

        int end = nums.length;
        if(end > 4){
            end = 4;
        }else{
            result = false;
        }

        for(int i = 0; i < end; i++) {
            if(nums[i] == 9){
                result = true;
            }else{
                result = false;
            }
        }
        System.out.println(result);

    }


}
