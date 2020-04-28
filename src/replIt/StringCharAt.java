package replIt;
/*
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.
 */

import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        String txt = s.next();

        String letter356 = ""+txt.charAt(2) + txt.charAt(4)+txt.charAt(5);
        System.out.print(letter356);
    }
}
