package replIt;
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");



        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);

        }



    }
}
