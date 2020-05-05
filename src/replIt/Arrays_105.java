package replIt;
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for(String eachWord: words ){
            String str = eachWord.substring(0,1) + eachWord.substring(eachWord.length()-1);
          //  String result = str + " ";
          //  String [] arr = result.split(" ");
          //  System.out.print(Arrays.toString(arr));
        }

       // System.out.println(str);

    }
}
