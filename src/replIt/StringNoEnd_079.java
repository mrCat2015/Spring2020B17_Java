package replIt;
/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo
 */

import java.util.Scanner;

public class StringNoEnd_079 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        int lastIndex = txt.length()-1;
        String result = txt.substring(0, lastIndex);

        System.out.println(result);

    }
}
