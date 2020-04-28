package replIt;
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue


In: poopoo what idk what im doing
ooooaiaioi
 */

import java.util.Scanner;

public class Assessment_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String result = "";

        for(int i = 0; i < word.length(); i ++){
            char each = word.charAt(i);
            if( each == 'a' ||each == 'e' || each == 'o' || each =='u' || each == 'i'){
                result += each;
            }


    }
        System.out.println(result);
    }

}
