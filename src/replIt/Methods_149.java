package replIt;
/*
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */

import java.util.Scanner;
import java.util.Arrays;


public class Methods_149 {
    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        // [1, 5, 77, 8], n = 2;

     int[] arr = new int[r.length + 1];

         for (int i = 0; i < r.length + 1; i++) {
             if (i == r.length) {//i=3,
                 arr[r.length] = n;
                 continue;
             }
             arr[i] = r[i];
         }

        System.out.println(Arrays.toString(arr));




    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
