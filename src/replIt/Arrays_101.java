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

public class Arrays_101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        int length = 0;
        String result = "";



       for(String each: words){
           result = ""+each.substring(0, 1) + each.substring(each.length()-1);

           System.out.println(result);

        }



    }
}
