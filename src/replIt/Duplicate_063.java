package replIt;
/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */

import java.util.Scanner;

public class Duplicate_063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

       // String duplicate = word1+word2+word2+word1;
        String duplicate = word1.concat(word2).concat(word2).concat(word1);

        System.out.println(duplicate);


    }
}
