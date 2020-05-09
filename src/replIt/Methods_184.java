package replIt;
/*
The next ArrayList method we are going to learn is .remove()

The .remove(i) method will remove the element at index i.  This means that all elements after index i will be shifted back to fill the hole left by the removal.

As an example, say you had an ArrayList called nums with values (6,2,3,1,9,2,5).  Running the following code:
nums.remove(1);
will result in (6,3,1,9,2,5).  Running the following code again:
nums.remove(3);
nums.remove(3);
will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the second remove(3) will remove the 2, leaving the 5.  Ask Mr. Murodil to demonstrate this if you're still confused.

On the left, write code that will remove the first two elements in an ArrayList of doubles (be careful, this is a little tricky!)

You got this Namik!
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Methods_184 {
    public static void test(ArrayList<Double> dubs)
    {

        dubs.remove(0);
        dubs.remove(0);

    }

}