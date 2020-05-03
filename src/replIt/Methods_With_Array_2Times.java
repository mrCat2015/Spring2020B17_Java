package replIt;
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_With_Array_2Times {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();

        for(Integer each: list){
            list1.add(each);
            list1.add(each);
        }

        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,5,3,7));
        twoTimes(list3);
        System.out.println(list3);
    }


}
