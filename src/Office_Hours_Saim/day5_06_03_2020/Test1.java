package Office_Hours_Saim.day5_06_03_2020;
/*
3) Create a method that will accept an int array and reverse the order of elements. Return the reversed array.
4) Overload the method to accept an ArrayList of integers and reverse the order of the elements. Return the reversed ArrayList
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Test1 {
    public static int[] reverse(int [] arr){

        int[]rev = new int[arr.length];
        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){
            rev[k] += arr[i];
            k++;

        }

        return rev;

    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){

        ArrayList<Integer> reversed = new ArrayList<Integer>();

        for(int i = list.size()-1; i >= 0; i--){
            reversed.add(list.get(i));

        }

        return reversed;

    }

    public static void main(String[] args) {
        int[]arr = {5,2,8,4,5};
        System.out.println(Arrays.toString(reverse(arr)));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,8,9));
        System.out.println(reverse(list));
    }
}
