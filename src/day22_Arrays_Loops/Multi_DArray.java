package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,};
        //            0 1 2

        int [][] arr2D = { {1, 2, 3} , {4,5,6}};
        //                     0           1

       int [] arr1D =  arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][1]);
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));





    }
}
