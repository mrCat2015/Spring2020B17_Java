package replIt;
/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the array. First method should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */

import java.util.Arrays;

public class Methods_176 {

    public int findMax(int [] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
}
    public double findMax(double [] arr) {
        Arrays.sort(arr);
        double max = arr[arr.length-1];
        return max;
    }
}
