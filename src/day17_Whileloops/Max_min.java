package day17_Whileloops;
/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxNumber = -2147483647;// any number the user provided will be greater than this number
        // first user entered variable will be initalized to MaxNumber
        int MinNumber = 2147483647;

        for (int i = 1; i < 11; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > MaxNumber) {
                MaxNumber = num;
            }
            if (num < MinNumber) {
                MinNumber = num;

            }


        }
        System.out.println("Max number is: " + MaxNumber);
        System.out.println("Min number is: " + MinNumber);


    }
}
