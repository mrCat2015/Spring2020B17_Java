package replIt;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */

import java.util.Scanner;

public class Array_First_Last {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(String eachWord: words){
            String str = eachWord.substring(0,1) + eachWord.substring(eachWord.length()-1);
            System.out.println(str);

        }


    }
}
