package replIt;
import java.util.Scanner;
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */

public class PrintHalfTwice_069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        String word = scan.next(); //lighting

        word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        System.out.println(word);






    }
}

