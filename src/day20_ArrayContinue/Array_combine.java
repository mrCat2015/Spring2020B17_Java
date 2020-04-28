package day20_ArrayContinue;
/*
write a program that can combine two arrays of any lengths, and retunr the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7];
        arr3 ==> [1,2,3,4,5,6,7]
 */

import java.util.Scanner;

public class Array_combine {
    public static void main(String[] args) {
        String[] arr1 = new String[3];
        String [] arr2 = new String[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 variables:");
        arr1[0] = input.next();
        arr1[1] = input.next();
        arr1[2] = input.next();

        System.out.println("Enter 5 variables");
        arr2[0] = input.next();
        arr2[1] = input.next();
        arr2[2] = input.next();
        arr2[3] = input.next();
        arr2[4] = input.next();


        System.out.println(arr1[0] + arr1[1] + arr1[2] + arr2[1] + arr2[2] + arr2[0] + arr2[3]+ arr2[4]);

    }
}
