package replIt;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String word = scan.next();
        int length =   word.length();
        System.out.println("Length is: "+length);
    }
}
