package replIt;
/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */

import java.util.Scanner;

public class MiddleThree_065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String middleChar = "";
        int totalLength = word.length();
        int middle = totalLength / 2;

        if(totalLength % 2 != 0 && totalLength >= 5){
            middleChar = middleChar + word.charAt(middle-1) + word.charAt(middle) + word.charAt(middle+1);
            System.out.println(middleChar);

        }else{
            System.out.println("invalid");
        }

    }
}
