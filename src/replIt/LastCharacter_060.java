package replIt;

import java.util.Scanner;

public class LastCharacter_060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String lastLetter = word.substring(word.length()-1);

        System.out.println(lastLetter);

    }
}
