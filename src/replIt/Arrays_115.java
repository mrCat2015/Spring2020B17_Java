package replIt;
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

import java.util.Scanner;
import java.util.Arrays;
public class Arrays_115 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

       String max = "";

        for(int i = 0; i <=words.length-1; i++){

            if(words[i].length() >= max.length()){
                max = words[i];
            }

        }


        //write your code below

        System.out.println(max);
    }


}
