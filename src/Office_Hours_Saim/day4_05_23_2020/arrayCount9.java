package Office_Hours_Saim.day4_05_23_2020;
/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class arrayCount9 {
    public static void main(String[] args) {
        int [] nums = {1, 9, 9};
        int count = 0;

        for(int each: nums ){
            if(each == 9){
                count ++;
            }
        }
        System.out.println(count);
    }

}
