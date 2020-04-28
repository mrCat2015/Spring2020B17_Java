package day22_Arrays_Loops;
/*
write a program that sort the array in descending order
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int [] RevArr = new int[arr.length];

        /*     i        j
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
 */

        int j = arr.length -1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));

    }
}
