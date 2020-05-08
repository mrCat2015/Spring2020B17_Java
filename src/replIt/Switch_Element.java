package replIt;
/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Switch_Element {

    public static int[] do_switch(int[] i) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        Collections.swap(list, 0, 3);

        return i;
    }


}
