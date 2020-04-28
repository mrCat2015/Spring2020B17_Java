package day17_Whileloops;
/*
1. write a program that can check

 */

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);

        String str = "Level";

        String reversedStr = ""; //store the reversed version of str
        int index = str.length()-1;//last index number

        while(index >=0){
            reversedStr += str.charAt(index);
            index --;

        }
       boolean palindrome = reversedStr.equalsIgnoreCase(str);

        System.out.println(palindrome);

    }
}
