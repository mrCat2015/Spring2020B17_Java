package replIt;
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String [] words = sentence.split(" ");

        //System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i>=0; i-- ){
             String eachWords = words[i];
             reversed += " " + eachWords;
             reversed = reversed.trim();
            System.out.print(reversed);
        }
        /*
         String[] word= sentence.split(" ");
    for (int i=word.length-1; i>=0; i--){
      reversed+=word[i]+" ";
    }
    reversed=reversed.substring(0,reversed.length()-1);
    //End your code here. do not modify below statement
    System.out.println(reversed);
         */








    }
}
