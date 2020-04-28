package replIt;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");

        for(int i = words.length-1; i >=0; i--){
            String reversed = words [i];
            System.out.println(reversed);
        }


    }
}
