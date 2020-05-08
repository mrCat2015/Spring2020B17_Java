package replIt;
/*
Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
 */

import java.util.Scanner;

public class Assessment_test_2_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String sent = input.next();

        boolean result = appearsTwice(word, sent);

        System.out.println(result);

    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;


        while(sentence.contains(target)) {

            sentence = sentence.replaceFirst(target, "");
            count++;

            }
        if(count == 2){
            return true;
        }


        return false;
    }

}
