package replIt;
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

import java.util.Scanner;

public class MaxLength_115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        words[0] = input.next();
        words[1] = input.next();
        words[2] = input.next();
        words[3] = input.next();
        words[4] = input.next();

    //    int length = input.length();




        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();


        }
    }
}
