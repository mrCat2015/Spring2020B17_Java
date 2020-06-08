package Office_Hours_Saim.day5_06_03_2020;
/*
1) Create a method that will accept an int array and return the sum of all the numbers in the given array
2) Overload the method to accept an ArrayList of integers and return the sum of all the numbers in the given ArrayList
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static int sum(int [] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

        }
        return sum;
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;

        for(int each: list){
            sum += each;

        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,45,67,5};
        System.out.println(sum(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,8,9));
        System.out.println(sum(list));
    }
}
