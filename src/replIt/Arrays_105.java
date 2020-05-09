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

        String [] arr = new String[words.length];


        for(int i = 0; i < words.length; i++){

            arr[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);

        }
        System.out.print(Arrays.asList(arr));
    }
}
