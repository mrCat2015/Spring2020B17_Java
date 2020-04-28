package replIt;

import java.util.Scanner;

/*
Write a program that will print out first and last letters together.
 */
public class PrintLastFirst_062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scan.next();

        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length()-1);

        System.out.print(firstLetter);
        System.out.print(lastLetter);


    }
}
