package replIt;
/*
This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_With_ArrayList_remove {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)
    {

        if(r.contains(n)){
            r.remove(n);
        }else{
            r.clear();
    }



        return r;


    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{3,99,3,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,4));


    }//end main
}
